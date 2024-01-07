package com.example.KeycloakSpringBoot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "orders")
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
