package prueba.API.de.numeros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDeNumerosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiDeNumerosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.menu();
	}
}
