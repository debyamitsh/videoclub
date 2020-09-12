package com.example.videoclub.Models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Client implements Serializable {
    private String nom;
    private String prenom;
    private String phone;
    private String address;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Client () {}

    public Client(String nom, String prenom, String phone, String address, Integer id) {
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
