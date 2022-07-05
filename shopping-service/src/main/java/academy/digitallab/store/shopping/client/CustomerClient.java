package academy.digitallab.store.shopping.client;

import academy.digitallab.store.shopping.model.Customer;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "customer-service", path = "/customers")
public interface CustomerClient {

    @GetMapping(value = "/{id}")
    @CircuitBreaker(name="customerDB",fallbackMethod="getCustomerFallback")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);
    default ResponseEntity<Customer> getCustomerFallback(RuntimeException e){
        Customer customer = Customer.builder()
                .numberID("none")
                .firstName("none")
                .lastName("none")
                .email("none")
                .photoUrl("none")
                .state("none").build();
        //return new ResponseEntity<String>("subscribe service is down", HttpStatus.OK);
        return ResponseEntity.ok(customer);
    }

}
