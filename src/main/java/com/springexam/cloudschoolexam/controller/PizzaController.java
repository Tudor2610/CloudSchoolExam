package com.springexam.cloudschoolexam.controller;

import com.springexam.cloudschoolexam.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class PizzaController {

    @Autowired
    PizzaService pizzaService;

    @GetMapping
    public List<String> displayAllPizzas() {
        return pizzaService.getAll();
    }
}
