package com.example.marvel_heroes;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/marvel")
@RequiredArgsConstructor
public class MarvelController {
    private final MarvelService marvelService;

    @PostMapping
    public MarvelResponse addHero(@RequestBody MarvelRequest marvelRequest) {
        return marvelService.addHero(marvelRequest);
    }

    @GetMapping
    public List<MarvelResponse> getAllHeroes() {
        return marvelService.getAllHeroes();
    }

    @GetMapping("/id")
    public MarvelResponse getHero(@RequestParam("id") int id) {
        return marvelService.getHero(id);
    }
}
