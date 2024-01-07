package com.example.KeycloakSpringBoot.services;

import com.example.KeycloakSpringBoot.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IMenuItemService {
    List<MenuItem> findAllByMenuId(Long id);

    void createMenuItem(MenuItem menuItem);

    Optional<MenuItem> findById(Long itemId);
}
