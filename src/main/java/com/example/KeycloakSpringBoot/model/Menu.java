package com.example.KeycloakSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue
    public Long id;
    private Long restaurantId;
    private Boolean active;
    @Transient
    private List<MenuItem> menuItemList;
}
