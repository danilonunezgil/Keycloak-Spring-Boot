package com.example.KeycloakSpringBoot.services.impl;

import com.example.KeycloakSpringBoot.model.Menu;
import com.example.KeycloakSpringBoot.model.MenuItem;
import com.example.KeycloakSpringBoot.repository.MenuItemRepository;
import com.example.KeycloakSpringBoot.repository.MenuRepository;
import com.example.KeycloakSpringBoot.services.IMenuItemService;
import com.example.KeycloakSpringBoot.services.IMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuServiceImp implements IMenuService, IMenuItemService {

    private final MenuRepository menuRepository;
    private final MenuItemRepository menuItemRepository;
    @Override
    public Menu findByRestaurantId(Long restaurantId) {
        return this.menuRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public void createMenu(Menu menu) {
        this.menuRepository.save(menu);
    }

    @Override
    public List<MenuItem> findAllByMenuId(Long id) {
        return this.menuItemRepository.findAllByMenuId(id);
    }

    @Override
    public void createMenuItem(MenuItem menuItem) {
        this.menuItemRepository.save(menuItem);
    }


    @Override
    public Optional<MenuItem> findById(Long itemId) {
        return this.menuItemRepository.findById(itemId);
    }
}
