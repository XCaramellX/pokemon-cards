package com.parkerrandolph.pokemoncards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.parkerrandolph.pokemoncards.repo.PokemonRepo;
import com.parkerrandolph.pokemoncards.service.PokemonApi;

@RestController
public class PokemonController {

    @Autowired
    private final PokemonRepo pokemonRepo;
    private final PokemonApi pokemonApi;

    public PokemonController(PokemonApi pokemonApi, PokemonRepo pokemonRepo){
        this.pokemonApi = pokemonApi;
        this.pokemonRepo = pokemonRepo;
    }

    @GetMapping(value = "/pokemon/{id}")
    public String getPokemonById(@PathVariable int id) {
        
        return "Pokemon Index";
    }
}
