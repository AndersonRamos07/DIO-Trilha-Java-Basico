package com.andersonros07.desafio_dio_padroes_de_projeto.padroes_de_projeto_desafio_dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PadroesDeProjetoDesafioDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetoDesafioDioApplication.class, args);
	}

}