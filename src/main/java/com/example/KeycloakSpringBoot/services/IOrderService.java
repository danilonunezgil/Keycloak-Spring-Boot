package com.example.KeycloakSpringBoot.services;

import com.example.KeycloakSpringBoot.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {
    List<Order> findByRestaurantId(Long restaurantId);

    Order findyOrderById(Long orderId);

    void createOrder(Order order);
}
