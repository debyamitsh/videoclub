package com.example.videoclub.controllers;

import com.example.videoclub.Models.entities.Cassette;
import com.example.videoclub.Models.repositories.CasseteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/cassette", value = "/cassette/add", method = RequestMethod.POST)
public class CassetteControlelr {
    @Autowired
    private CasseteRepository casseteRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    void addNewCassette(@RequestParam int id,
                      @RequestParam String nom,
                      @RequestParam String numero){
        Cassette cassette = new Cassette();
        cassette.setId(id);
        cassette.setNom(nom);
        cassette.setNumero(numero);
    }
    @GetMapping(path = "all")
    public @ResponseBody
    Iterable<Cassette> getAllCassette(){
        return casseteRepository.findAll();
    }
}



