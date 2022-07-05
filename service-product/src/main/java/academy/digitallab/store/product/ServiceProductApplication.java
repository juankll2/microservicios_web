package academy.digitallab.store.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProductApplication {

	public static void main(String[] args) {
		//SpringApplication app = new SpringApplication(ServiceProductApplication.class);
		//app.setDefaultProperties(Collections
		//		.singletonMap("server.port", "8091"));
		//app.run(args);

		SpringApplication.run(ServiceProductApplication.class, args);
	}

}
