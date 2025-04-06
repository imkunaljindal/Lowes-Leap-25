package com.example.marvel_heroes.controller;

import com.example.marvel_heroes.MarvelController;
import com.example.marvel_heroes.MarvelRequest;
import com.example.marvel_heroes.MarvelResponse;
import com.example.marvel_heroes.MarvelService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.mockito.ArgumentMatchers.anyInt;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(MockitoExtension.class)
@WebMvcTest(controllers = MarvelController.class)
public class MarvelControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    MarvelService marvelService;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testAddHero() throws Exception {
        MarvelRequest request = MarvelRequest.builder()
                .id(1)
                .name("Iron Man")
                .build();
        String requestBody = objectMapper.writeValueAsString(request);

        MarvelResponse response = MarvelResponse.builder()
                .name("Iron Man")
                .build();

        when(marvelService.addHero(any(MarvelRequest.class))).thenReturn(response);

        mockMvc.perform(post("/api/v1/marvel")
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name")
                        .value(response.getName()));
    }

    @Test
    public void testGetHeroById() throws Exception {
        MarvelResponse response = MarvelResponse.builder()
                .name("Iron Man")
                .build();
        when(marvelService.getHero(anyInt())).thenReturn(response);

        mockMvc.perform(get("/api/v1/marvel/id")
                .param("id", String.valueOf(1)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name")
                        .value(response.getName()));
    }
}
