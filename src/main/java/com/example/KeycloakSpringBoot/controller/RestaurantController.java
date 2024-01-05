package com.example.KeycloakSpringBoot.controller;

import com.example.KeycloakSpringBoot.model.Menu;
import com.example.KeycloakSpringBoot.model.Restaurant;
import com.example.KeycloakSpringBoot.services.IMenuItemService;
import com.example.KeycloakSpringBoot.services.IMenuService;
import com.example.KeycloakSpringBoot.services.IRestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping()
    public Restaurant createRestaurant(Restaurant restaurant){
        return this.iRestaurantService.createRestaurant(restaurant);
    }
}
