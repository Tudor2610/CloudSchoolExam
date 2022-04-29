package com.springexam.cloudschoolexam.service;

import com.springexam.cloudschoolexam.exceptions.ClientDoesNotExistException;
import com.springexam.cloudschoolexam.model.Client;
import com.springexam.cloudschoolexam.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getClientById(Integer id) throws ClientDoesNotExistException {
        return clientRepository.findById(id).get();
    }
}
