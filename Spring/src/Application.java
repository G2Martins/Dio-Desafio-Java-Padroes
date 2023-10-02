package one.digitalInnovation.labpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *	Projeto Spring Boot gerado via Spring Initializer.
 * 	Os Seguintes módulos foram selecionados:
 * 	-	Spring Data JPA
 * 	-	Spring Web
 * 	- 	H2 Database
 * 	-	OpenFeign
 * 
 * @author G2Martins
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
