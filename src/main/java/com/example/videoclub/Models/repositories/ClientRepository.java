package com.example.videoclub.Models.repositories;

import com.example.videoclub.Models.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Integer> {
}
