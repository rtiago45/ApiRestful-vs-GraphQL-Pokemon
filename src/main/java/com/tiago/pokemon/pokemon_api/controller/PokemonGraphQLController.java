package com.tiago.pokemon.pokemon_api.controller;



import com.tiago.pokemon.pokemon_api.model.Pokemon;
import com.tiago.pokemon.pokemon_api.service.PokemonService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PokemonGraphQLController {

    private final PokemonService pokemonService;

    public PokemonGraphQLController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @QueryMapping
    public Pokemon pokemon(@Argument String name) {
        return pokemonService.getPokemon(name);
    }

    @QueryMapping
    public List<Pokemon> pokemons(@Argument List<String> names) {
        return names.stream()
                .map(pokemonService::getPokemon)
                .toList();
    }
}

