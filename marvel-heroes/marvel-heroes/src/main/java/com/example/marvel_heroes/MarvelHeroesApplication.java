package com.example.marvel_heroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MarvelHeroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelHeroesApplication.class, args);
	}

}
