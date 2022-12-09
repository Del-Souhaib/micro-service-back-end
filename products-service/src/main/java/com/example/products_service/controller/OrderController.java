package com.example.products_service.controller;

import com.example.products_service.model.Order;
import com.example.products_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("")
    public List<Order> reservationList(){
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public List<Order> reservationByClient(@PathVariable Long id){
        return orderRepository.findAllByClientId(id);
    }

    @PostMapping("")
    public void addReservation(@RequestBody Order order){
        orderRepository.save(order);
    }

}
