package com.example.KeycloakSpringBoot.repository;

import com.example.KeycloakSpringBoot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByRestaurantId(Long restaurantId);
}
