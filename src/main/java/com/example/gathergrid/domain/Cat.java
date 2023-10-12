package com.example.gathergrid.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;


    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

}
