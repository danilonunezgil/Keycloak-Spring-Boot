package com.example.KeycloakSpringBoot.services;

import com.example.KeycloakSpringBoot.model.Menu;
import org.springframework.stereotype.Service;

@Service
public interface IMenuService {
    Menu findByRestaurantId(Long restaurantId);
}
