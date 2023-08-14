package com.parkerrandolph.pokemoncards.service;


import com.parkerrandolph.pokemoncards.models.Pokemon;

public interface PokemonApiInterface {

    Pokemon getPokemonById(int id);
    Pokemon getPokemonById(String name);

}
