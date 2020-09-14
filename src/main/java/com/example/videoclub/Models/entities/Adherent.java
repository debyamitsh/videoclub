package com.example.videoclub.Models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance
public class Adherent extends Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
