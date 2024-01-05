package com.example.KeycloakSpringBoot.services;

import com.example.KeycloakSpringBoot.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMenuItemService {
    List<MenuItem> findAllByMenuId(Long id);
}
