package com.tiago.pokemon.pokemon_api.service;


import com.tiago.pokemon.pokemon_api.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon getPokemon(String name) {
        String url = POKEAPI_URL + name.toLowerCase();
        return restTemplate.getForObject(url, Pokemon.class);
    }
}

