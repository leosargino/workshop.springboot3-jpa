package com.example.demo.services;

import com.example.demo.entities.OrderItem;
import com.example.demo.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll(){
        return orderItemRepository.findAll();
    }

    public OrderItem findById(Long id){
        Optional<OrderItem> obj = orderItemRepository.findById(id);
        return obj.get();
    }

}
