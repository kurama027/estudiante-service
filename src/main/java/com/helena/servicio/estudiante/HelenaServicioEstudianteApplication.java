package com.helena.servicio.estudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class HelenaServicioEstudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelenaServicioEstudianteApplication.class, args);
	}

}
