package com.example.sprrest.controller;

import com.example.sprrest.model.Order;
import com.example.sprrest.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @GetMapping(value = "/orderById")
    public Order getOrderById() {
        return orderRepository.getOrderById(2);
    }

    @GetMapping(value = "/allOrders")
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

}
