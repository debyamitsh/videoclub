package com.example.videoclub.Models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class DemandeAbonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dateDemande;
    private String codeDemande;
    @OneToOne
    private NonAbonnee nonAbonnee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getCodeDemande() {
        return codeDemande;
    }

    public void setCodeDemande(String codeDemande) {
        this.codeDemande = codeDemande;
    }

    public NonAbonnee getNonAbonnee() {
        return nonAbonnee;
    }

    public void setNonAbonnee(NonAbonnee nonAbonnee) {
        this.nonAbonnee = nonAbonnee;
    }
}
