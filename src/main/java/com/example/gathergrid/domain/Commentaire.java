package com.example.gathergrid.domain;

import jakarta.persistence.*;

@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private Integer evaluation;
    @ManyToOne
    private User user;

    private Event event;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }



}
