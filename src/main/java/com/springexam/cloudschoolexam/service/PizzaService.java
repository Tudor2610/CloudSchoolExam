package com.springexam.cloudschoolexam.service;

import com.springexam.cloudschoolexam.model.*;
import com.springexam.cloudschoolexam.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {

    @Autowired
    PizzaRepository pizzaRepository;

    private static int call = 0;

    private void addPizzastoMenu(){
        pizzaRepository.save(new PizzaMargherita());
        pizzaRepository.save(new PizzaDiavola());
        pizzaRepository.save(new PizzaQuattroStagioni());
        pizzaRepository.save(new PizzaProsciuttoEFunghi());
        call = 1;
    }

    public List<String> getAll() {
        if (call == 0) {
            addPizzastoMenu();
        }
        List<String> aux = new ArrayList<>();
        for(Pizza p : pizzaRepository.findAll()) {
            aux.add(p.getPizzaType());
        }
        return aux;
    }
}
