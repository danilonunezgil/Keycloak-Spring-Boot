package com.example.KeycloakSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class OrderItem {
    @Id
    @GeneratedValue
    public Long id;
    private Long orderId;
    private Long menuItemId;
    private BigDecimal price;
}
