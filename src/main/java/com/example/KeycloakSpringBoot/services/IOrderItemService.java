package com.example.KeycloakSpringBoot.services;

import com.example.KeycloakSpringBoot.model.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IOrderItemService {
    List<OrderItem> findByOrderId(Long orderId);
    void createOrderItem(OrderItem orderItem);
}
