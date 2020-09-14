package com.example.videoclub.controllers;

import com.example.videoclub.Models.entities.Gestionnaire;
import com.example.videoclub.Models.repositories.GestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/gestion", value = "/gestion/add", method = RequestMethod.POST)
public class GestionnaireController {
    @Autowired
    private GestionnaireRepository gestionnaireRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    void addNewGestionnaire(@RequestParam int id,
                        @RequestParam String nom,
                        @RequestParam String prenom,
                            @RequestParam String phone,
                            @RequestParam String address){

       Gestionnaire gestionnaire = new Gestionnaire();
        gestionnaire.setId(id);
        gestionnaire.setNom(nom);
        gestionnaire.setPrenom(prenom);
        gestionnaire.setPhone(phone);
        gestionnaire.setAddress(address);
    }
    @GetMapping(path = "all")
    public @ResponseBody
    Iterable<Gestionnaire> getAllCassette(){
        return gestionnaireRepository.findAll();
    }
}
