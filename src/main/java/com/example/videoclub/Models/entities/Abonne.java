package com.example.videoclub.Models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Abonne extends Adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String codeAbonne;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeAbonne() {
        return codeAbonne;
    }

    public void setCodeAbonne(String codeAbonne) {
        this.codeAbonne = codeAbonne;
    }
}
