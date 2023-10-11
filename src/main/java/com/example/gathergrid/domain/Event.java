package com.example.gathergrid.domain;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Date;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @Column(name = "date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "time", columnDefinition = "TIME")
    @Temporal(TemporalType.TIME)
    private Time time;
    private String lieu;
    private String description;
    private String organisateur;


    public Event(Long id, String nom, Date date, Time time, String lieu, String description, String organisateur) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.time = time;
        this.lieu = lieu;
        this.description = description;
        this.organisateur = organisateur;
    }

    public Event() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }


}
