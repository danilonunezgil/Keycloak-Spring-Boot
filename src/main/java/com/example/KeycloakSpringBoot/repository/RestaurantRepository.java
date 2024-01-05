package com.example.KeycloakSpringBoot.repository;

import com.example.KeycloakSpringBoot.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
