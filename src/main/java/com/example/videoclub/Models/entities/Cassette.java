package com.example.videoclub.Models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cassette implements Serializable {
    private Integer id;
    private String nom;
    private String numero;
    private Location location;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn()
    public Location getLocation(Location location) {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
