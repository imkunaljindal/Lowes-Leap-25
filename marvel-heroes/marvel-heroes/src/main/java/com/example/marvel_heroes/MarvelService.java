package com.example.marvel_heroes;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MarvelService {

    private final MarvelRepository marvelRepository;

    public MarvelResponse addHero(MarvelRequest marvelRequest) {
        Marvel hero = Marvel.builder()
                .id(marvelRequest.getId())
                .name(marvelRequest.getName())
                .build();

        Marvel savedHero = marvelRepository.save(hero);

        return MarvelResponse.builder()
                .name(savedHero.getName())
                .build();
    }

    public List<MarvelResponse> getAllHeroes() {
        List<Marvel> heroes = marvelRepository.findAll();

        List<MarvelResponse> responses = new ArrayList<>();
        for(Marvel hero: heroes) {
            MarvelResponse response = MarvelResponse.builder()
                    .name(hero.getName())
                    .build();
            responses.add(response);
        }

        return responses;
    }
}
