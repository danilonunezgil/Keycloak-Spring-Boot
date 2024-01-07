package com.example.KeycloakSpringBoot.controller;

import com.example.KeycloakSpringBoot.model.Menu;
import com.example.KeycloakSpringBoot.model.MenuItem;
import com.example.KeycloakSpringBoot.model.Restaurant;
import com.example.KeycloakSpringBoot.services.IMenuItemService;
import com.example.KeycloakSpringBoot.services.IMenuService;
import com.example.KeycloakSpringBoot.services.IRestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {

    private final IRestaurantService iRestaurantService;
    private final IMenuService iMenuService;
    private final IMenuItemService iMenuItemService;

    //Public API
    @GetMapping("/public/list")
    public List<Restaurant> getRestaurants(){
        return this.iRestaurantService.findAll();
    }

    //Public API
    @GetMapping("/public/menu/{restaurantId}")
    public Menu getMenu(@PathVariable Long restaurantId){
        Menu menu = this.iMenuService.findByRestaurantId(restaurantId);
        menu.setMenuItemList(this.iMenuItemService.findAllByMenuId(menu.getId()));
        return menu;
    }

    //Admin can access
    @PostMapping("/create")
    @PreAuthorize("hasRole('admin')")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return this.iRestaurantService.createRestaurant(restaurant);
    }

    //Manager can access
    @PostMapping("/create-menu")
    @PreAuthorize("hasRole('manager')")
    public Menu createMenu(@RequestBody Menu menu){
        iMenuService.createMenu(menu);
        menu.getMenuItemList().forEach(menuItem -> {
            menuItem.setMenuId(menu.getId());
            iMenuItemService.createMenuItem(menuItem);
        });
        return menu;
    }

    //Owner can access
    @PutMapping ("/menu/item/{itemId}/{price}")
    @PreAuthorize("hasRole('owner')")
    public MenuItem updateMenuItemPrice(@PathVariable Long itemId, @PathVariable BigDecimal price){
        Optional<MenuItem> menuItem = this.iMenuItemService.findById(itemId);
        menuItem.get().setPrice(price);
        this.iMenuItemService.createMenuItem(menuItem.get());
        return menuItem.get();
    }
}
