package com.inseong.demo.domain.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public List<Order> orders(){
        List<Order> orders = orderRepository.findAll();
        return orders;
    }
}
