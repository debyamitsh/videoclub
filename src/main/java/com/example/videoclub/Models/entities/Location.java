package com.example.videoclub.Models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dateLocation;
    private String codeLocation;
    private Date dateRetourn;
    @OneToOne
    private Adherent adherent;
    @OneToMany
    private List<Cassette> cassetteList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateLocation() {
        return dateLocation;
    }

    public void setDateLocation(Date dateLocation) {
        this.dateLocation = dateLocation;
    }

    public String getCodeLocation() {
        return codeLocation;
    }

    public void setCodeLocation(String codeLocation) {
        this.codeLocation = codeLocation;
    }

    public Date getDateRetourn() {
        return dateRetourn;
    }

    public void setDateRetourn(Date dateRetourn) {
        this.dateRetourn = dateRetourn;
    }

    public List<Cassette> getCassetteList() {
        return cassetteList;
    }

    public void setCassetteList(List<Cassette> cassetteList) {
        this.cassetteList = cassetteList;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }
}
