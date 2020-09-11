package com.example.videoclub.Models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String codeAbonnement;
    private Date debutAbonnement;
    private Date finnAbonnement;
    @OneToOne
    private NonAbonnee nonAbonnee;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeAbonnement() {
        return codeAbonnement;
    }

    public void setCodeAbonnement(String codeAbonnement) {
        this.codeAbonnement = codeAbonnement;
    }

    public Date getDebutAbonnement() {
        return debutAbonnement;
    }

    public void setDebutAbonnement(Date debutAbonnement) {
        this.debutAbonnement = debutAbonnement;
    }

    public Date getFinnAbonnement() {
        return finnAbonnement;
    }

    public void setFinnAbonnement(Date finnAbonnement) {
        this.finnAbonnement = finnAbonnement;
    }

    public NonAbonnee getNonAbonnee() {
        return nonAbonnee;
    }

    public void setNonAbonnee(NonAbonnee nonAbonnee) {
        this.nonAbonnee = nonAbonnee;
    }
}
