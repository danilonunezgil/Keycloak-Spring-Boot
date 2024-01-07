package com.example.KeycloakSpringBoot.services;

import com.example.KeycloakSpringBoot.model.Menu;
import org.springframework.stereotype.Service;

public interface IMenuService {
    Menu findByRestaurantId(Long restaurantId);

    void createMenu(Menu menu);
}
