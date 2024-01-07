package com.example.KeycloakSpringBoot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private Long restaurantId;
    private Boolean active;
    @Transient
    private List<MenuItem> menuItemList;
}
