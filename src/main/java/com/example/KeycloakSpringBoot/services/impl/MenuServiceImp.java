package com.example.KeycloakSpringBoot.services.impl;

import com.example.KeycloakSpringBoot.model.Menu;
import com.example.KeycloakSpringBoot.model.MenuItem;
import com.example.KeycloakSpringBoot.repository.MenuItemRepository;
import com.example.KeycloakSpringBoot.repository.MenuRepository;
import com.example.KeycloakSpringBoot.services.IMenuItemService;
import com.example.KeycloakSpringBoot.services.IMenuService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MenuServiceImp implements IMenuService, IMenuItemService {

    private final MenuRepository menuRepository;
    private final MenuItemRepository menuItemRepository;
    @Override
    public Menu findByRestaurantId(Long restaurantId) {
        return this.menuRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public List<MenuItem> findAllByMenuId(Long id) {
        return this.menuItemRepository.findAllByMenuId(id);
    }
}
