package com.parkerrandolph.pokemoncards.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.parkerrandolph.pokemoncards.models.Pokemon;

@Service
public class PokemonApi implements PokemonApiInterface {

    private final String url = "https://pokeapi.co/api/v2/pokemon/";
    private final RestTemplate restPokemonTemplate = new RestTemplate();

    @Override
    public Pokemon getPokemonById(int id) {
      String pokeUrl = url + id;
      return restPokemonTemplate.getForObject(pokeUrl, Pokemon.class);
    }

    @Override
    public Pokemon getPokemonById(String name) {
        String pokeUrl = url + name;
      return restPokemonTemplate.getForObject(pokeUrl, Pokemon.class);
    }
    
}
