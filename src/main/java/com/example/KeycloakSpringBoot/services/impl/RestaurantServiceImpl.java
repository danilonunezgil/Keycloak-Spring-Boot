package com.example.KeycloakSpringBoot.services.impl;

import com.example.KeycloakSpringBoot.model.Restaurant;
import com.example.KeycloakSpringBoot.repository.RestaurantRepository;
import com.example.KeycloakSpringBoot.services.IRestaurantService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RestaurantServiceImpl implements IRestaurantService {

    private final RestaurantRepository restaurantRepository;
    @Override
    public List<Restaurant> findAll() {
        return this.restaurantRepository.findAll();
    }

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return this.restaurantRepository.save(restaurant);
    }
}
