package com.example.videoclub.controllers;

import com.example.videoclub.Models.entities.Editeur;
import com.example.videoclub.Models.repositories.EditeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/editeur", value = "/editeur/add", method = RequestMethod.POST)
public class EditeurController {
    @Autowired
    private EditeurRepository editeurRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    void addNewEditeur(@RequestParam int id,
                      @RequestParam String nom,
                      @RequestParam String address){

        Editeur editeur = new Editeur();
        editeur.setId(id);
        editeur.setNom(nom);
        editeur.setAdress(address);
    }
    @GetMapping(path = "all")
    public @ResponseBody
    Iterable<Editeur> getAllClient(){
        return editeurRepository.findAll();
    }
}
