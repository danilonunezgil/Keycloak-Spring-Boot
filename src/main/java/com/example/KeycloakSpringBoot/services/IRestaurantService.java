package com.example.KeycloakSpringBoot.services;

import com.example.KeycloakSpringBoot.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IRestaurantService {
    List<Restaurant> findAll();
    Restaurant createRestaurant(Restaurant restaurant);
}
