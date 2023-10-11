package com.example.gathergrid.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Billet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double prix ;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
