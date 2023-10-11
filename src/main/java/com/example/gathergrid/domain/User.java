package com.example.gathergrid.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prénom;
    private  String mot_de_passe ;
    private String e_mail;

    @OneToMany
    List<Event> events = new ArrayList<>();

    public User( String nom, String prénom, String mot_de_passe, String e_mail) {
        this.nom = nom;
        this.prénom = prénom;
        this.mot_de_passe = mot_de_passe;
        this.e_mail = e_mail;
    }

    public User() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(nom, user.nom) && Objects.equals(prénom, user.prénom) && Objects.equals(mot_de_passe, user.mot_de_passe) && Objects.equals(e_mail, user.e_mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prénom, mot_de_passe, e_mail);
    }

    @Override
    public String toString() {
        return "User{" +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                ", e_mail='" + e_mail + '\'' +
                '}';
    }
}
