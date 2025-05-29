package ar.edu.utn.frba.dds.servicioAgregador;

import ar.edu.utn.frba.dds.servicioAgregador.config.ColeccionDeDocumentosSpam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServicioAgregadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioAgregadorApplication.class, args);
	}

}
