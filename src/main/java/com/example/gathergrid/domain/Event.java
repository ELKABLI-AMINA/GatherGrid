package com.example.gathergrid.domain;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;

    String name ;

    public Event(String name) {
        this.name = name;
    }

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
