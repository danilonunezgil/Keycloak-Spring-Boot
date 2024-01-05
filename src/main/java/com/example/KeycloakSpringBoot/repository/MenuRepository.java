package com.example.KeycloakSpringBoot.repository;

import com.example.KeycloakSpringBoot.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    Menu findByRestaurantId(Long restaurantId);
}
