package com.coomeva.fidelizacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.coomeva.fidelizacion.repository.UserRepository;

@SpringBootApplication
public class FidelizacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FidelizacionApplication.class, args);
	}

}
