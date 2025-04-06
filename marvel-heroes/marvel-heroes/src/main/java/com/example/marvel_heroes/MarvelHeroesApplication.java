package com.example.marvel_heroes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MarvelHeroesApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(MarvelHeroesApplication.class, args);
	}

}
