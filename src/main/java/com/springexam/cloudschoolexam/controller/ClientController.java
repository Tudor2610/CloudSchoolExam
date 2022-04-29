package com.springexam.cloudschoolexam.controller;

import com.springexam.cloudschoolexam.exceptions.ClientDoesNotExistException;
import com.springexam.cloudschoolexam.model.Client;
import com.springexam.cloudschoolexam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/register")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getClientById (@PathVariable Integer id) throws ClientDoesNotExistException {
        return clientService.getClientById(id);
    }
}
