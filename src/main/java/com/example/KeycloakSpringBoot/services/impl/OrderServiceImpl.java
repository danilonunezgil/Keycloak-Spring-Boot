package com.example.KeycloakSpringBoot.services.impl;

import com.example.KeycloakSpringBoot.model.Order;
import com.example.KeycloakSpringBoot.model.OrderItem;
import com.example.KeycloakSpringBoot.repository.OrderItemRepository;
import com.example.KeycloakSpringBoot.repository.OrderRepository;
import com.example.KeycloakSpringBoot.services.IOrderItemService;
import com.example.KeycloakSpringBoot.services.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements IOrderService, IOrderItemService {
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    @Override
    public List<Order> findByRestaurantId(Long restaurantId) {
        return this.orderRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public Order findyOrderById(Long orderId) {
        return this.orderRepository.findById(orderId).get();
    }

    @Override
    public void createOrder(Order order) {
        this.orderRepository.save(order);
    }

    @Override
    public List<OrderItem> findByOrderId(Long orderId) {
        return this.orderItemRepository.findOrderBy(orderId);
    }

    @Override
    public void createOrderItem(OrderItem orderItem) {
        this.orderItemRepository.save(orderItem);
    }
}
