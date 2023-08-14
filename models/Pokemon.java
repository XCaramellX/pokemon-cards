package com.parkerrandolph.pokemoncards.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long base_experience;

    @Column
    private Long height;

    @Column
    private Long weight;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getBase_experience() {
        return base_experience;
    }

    public Long getHeight() {
        return height;
    }

    public Long getWeight() {
        return weight;
    }


}
