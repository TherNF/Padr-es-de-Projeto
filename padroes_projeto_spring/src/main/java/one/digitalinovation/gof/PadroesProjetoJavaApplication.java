package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * */

@SpringBootApplication
@EnableFeignClients
public class PadroesProjetoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoJavaApplication.class, args);
	}

}
