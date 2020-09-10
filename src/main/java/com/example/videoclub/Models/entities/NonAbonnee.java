package com.example.videoclub.Models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NonAbonnee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
