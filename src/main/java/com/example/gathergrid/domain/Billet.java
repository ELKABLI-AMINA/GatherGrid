package com.example.gathergrid.domain;

import jakarta.persistence.*;

@Entity

public class Billet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double prix ;

    @ManyToOne
    Event event;


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
