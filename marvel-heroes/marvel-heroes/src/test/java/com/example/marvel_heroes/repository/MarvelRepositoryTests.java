package com.example.marvel_heroes.repository;

import com.example.marvel_heroes.Marvel;
import com.example.marvel_heroes.MarvelRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@AutoConfigureTestDatabase
public class MarvelRepositoryTests {

    @Autowired
    MarvelRepository marvelRepository;

    @Test
    public void whenSavedHero_thenReturnNonNullHero(){
        Marvel hero = Marvel.builder()
                .id(1)
                .name("Thor")
                .build();

        Marvel savedHero = marvelRepository.save(hero);

        Assertions.assertNotNull(savedHero);
        Assertions.assertEquals("Thor",savedHero.getName());
    }
}
