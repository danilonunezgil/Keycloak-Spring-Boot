package com.example.KeycloakSpringBoot.controller;

import com.example.KeycloakSpringBoot.model.MenuItem;
import com.example.KeycloakSpringBoot.model.Order;
import com.example.KeycloakSpringBoot.model.OrderItem;
import com.example.KeycloakSpringBoot.services.IOrderItemService;
import com.example.KeycloakSpringBoot.services.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final IOrderService iOrderService;
    private final IOrderItemService iOrderItemService;

    //Manager can access
    @GetMapping("/{restaurantId}/list")
    public List<Order> getOrders(@PathVariable Long restaurantId){
        return this.iOrderService.findByRestaurantId(restaurantId);
    }

    //Manager can access
    @GetMapping("/{orderId}")
    public Order getOrderDetails(@PathVariable Long orderId){
        Order order = this.iOrderService.findyOrderById(orderId);
        order.setOrderItemList(this.iOrderItemService.findByOrderId(order.getId()));
        return order;
    }

    //Authenticated users can access
    @PostMapping()
    public Order createOrder(@RequestBody Order order){
        this.iOrderService.createOrder(order);
        List<OrderItem> orderItems = order.getOrderItemList();
        orderItems.forEach(orderItem -> {
            orderItem.setOrderId(order.id);
            iOrderItemService.createOrderItem(orderItem);
        });
        return order;
    }



}
