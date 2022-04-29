package com.springexam.cloudschoolexam.service;

import com.springexam.cloudschoolexam.exceptions.OrderNotFoundException;
import com.springexam.cloudschoolexam.model.Order;
import com.springexam.cloudschoolexam.repository.OrderRepository;
import com.springexam.cloudschoolexam.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;


    public Order registerOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrderById(Integer orderId) throws OrderNotFoundException {
        return orderRepository.findById(orderId).get();
    }
}
