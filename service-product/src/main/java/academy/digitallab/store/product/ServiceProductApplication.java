package academy.digitallab.store.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ServiceProductApplication {

	public static void main(String[] args) {
		//SpringApplication app = new SpringApplication(ServiceProductApplication.class);
		//app.setDefaultProperties(Collections
		//		.singletonMap("server.port", "8091"));
		//app.run(args);

		SpringApplication.run(ServiceProductApplication.class, args);
	}

}
