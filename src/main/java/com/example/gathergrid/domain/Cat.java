package com.example.gathergrid.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String description;
    @OneToMany
    List<Event> events = new ArrayList<>();

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

}
