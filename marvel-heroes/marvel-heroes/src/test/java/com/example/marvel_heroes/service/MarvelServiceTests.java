package com.example.marvel_heroes.service;

import com.example.marvel_heroes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MarvelServiceTests {

    @Mock
    MarvelRepository marvelRepository;

    @InjectMocks
    MarvelService marvelService;

    @Test
    public void whenSavedMarvelHero_thenReturnNonNullResponse() {
        MarvelRequest request = MarvelRequest.builder()
                .id(1)
                .name("Thor")
                .build();

        Marvel hero = Marvel.builder()
                .id(1)
                .name("Thor")
                .build();

        Mockito.when(marvelRepository.save(Mockito.any(Marvel.class))).thenReturn(hero);

        MarvelResponse response = marvelService.addHero(request);

        Assertions.assertNotNull(response);
        Assertions.assertEquals("Thor",response.getName());
    }

    @Test
    public void whenFindAll_thenReturnAllHeroes() {
        Marvel hero1 = Marvel.builder()
                .id(1)
                .name("Thor")
                .build();
        Marvel hero2 = Marvel.builder()
                .id(2)
                .name("Iron Man")
                .build();

        List<Marvel> heroes = new ArrayList<>();
        heroes.add(hero1);
        heroes.add(hero2);

        Mockito.when(marvelRepository.findAll()).thenReturn(heroes);

        List<MarvelResponse> responses = marvelService.getAllHeroes();
        Assertions.assertNotNull(responses);
        Assertions.assertEquals(2,responses.size());


    }
}
