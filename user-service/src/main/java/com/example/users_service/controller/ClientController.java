package com.example.users_service.controller;

import com.example.users_service.model.Client;
import com.example.users_service.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("")
    public List<Client> clientList(){
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client client(@PathVariable Long id){
        return clientRepository.findFirstById(id);
    }

    @PostMapping("")
    public void addClient(@RequestBody Client client){
        clientRepository.save(client);
    }

}
