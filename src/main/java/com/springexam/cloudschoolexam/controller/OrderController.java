package com.springexam.cloudschoolexam.controller;

import com.springexam.cloudschoolexam.exceptions.ClientDoesNotExistException;
import com.springexam.cloudschoolexam.exceptions.OrderNotFoundException;
import com.springexam.cloudschoolexam.model.Order;
import com.springexam.cloudschoolexam.service.ClientService;
import com.springexam.cloudschoolexam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    ClientService clientService;

    @PostMapping("/register/{id}")
    public Order registerOrder(@RequestBody Order order, @PathVariable Integer id) throws ClientDoesNotExistException {
        clientService.getClientById(id).setOrder(order);
        return orderService.registerOrder(order);
    }

    @GetMapping("/display/{id}")
    public Order getOrderById(@PathVariable Integer id) throws OrderNotFoundException {
        return orderService.getOrderById(id);
    }

}
