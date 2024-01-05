package com.example.KeycloakSpringBoot.repository;

import com.example.KeycloakSpringBoot.model.Order;
import com.example.KeycloakSpringBoot.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findOrderBy(Long id);
}
