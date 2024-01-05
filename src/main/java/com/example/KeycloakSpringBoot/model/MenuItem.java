package com.example.KeycloakSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class MenuItem {
    @Id
    @GeneratedValue
    public Long id;
    private Long menuId;
    private String name;
    private String description;
    private String type;
    private String group;
    private BigDecimal price;
}
