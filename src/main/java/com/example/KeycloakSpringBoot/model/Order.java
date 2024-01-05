package com.example.KeycloakSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue
    public Long id;
    private Long restaurantId;
    private BigDecimal total;
    @Transient
    private List<OrderItem> orderItemList;
}
