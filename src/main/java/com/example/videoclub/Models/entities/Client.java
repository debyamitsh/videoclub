package com.example.videoclub.Models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Client implements Serializable {
    private String nom;
    private String prenom;
    private String phone;
    private String address;
    private Integer id;

    @Column
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Column
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Integer getId() {
        return id;
    }
}
