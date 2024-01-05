package com.example.KeycloakSpringBoot.repository;

import com.example.KeycloakSpringBoot.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findAllByMenuId(Long id);
}
