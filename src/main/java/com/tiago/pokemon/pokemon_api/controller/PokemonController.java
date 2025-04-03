package com.tiago.pokemon.pokemon_api.controller;



import com.tiago.pokemon.pokemon_api.model.Pokemon;
import com.tiago.pokemon.pokemon_api.service.PokemonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/{name}")
    public Pokemon getPokemon(@PathVariable String name) {
        return pokemonService.getPokemon(name);
    }
}
