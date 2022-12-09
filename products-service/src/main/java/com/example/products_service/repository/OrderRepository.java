package com.example.products_service.repository;

import com.example.products_service.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,String> {


    List<Order> findAllByClientId(Long id);
}
