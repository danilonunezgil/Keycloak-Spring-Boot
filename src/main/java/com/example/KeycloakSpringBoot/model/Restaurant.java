package com.example.KeycloakSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue
    public Long id;
    private String name;
    private String location;
    private String type;
}
