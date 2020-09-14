package com.example.videoclub.controllers;
import com.example.videoclub.Models.entities.Client;
import com.example.videoclub.Models.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    void addNewClient(@RequestParam int id,
                      @RequestParam String nom,
                      @RequestParam String prenom,
                      @RequestParam String phone,
                      @RequestParam String address){
        Client client = new Client();
        client.setId(id);
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setPhone(phone);
        client.setAddress(address);
    }
    @GetMapping(path = "all")
    public @ResponseBody
    Iterable<Client> getAllClient(){
        return clientRepository.findAll();
    }
}
