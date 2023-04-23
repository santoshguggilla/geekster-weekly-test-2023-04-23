package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Restaurant;
import com.example.demo.service.RestaurantService;

@Validated
@RestController
public class RestaurantController {

	@Autowired
    RestaurantService restaurantService;

    //get me all the restaurants in my present restaurant-List:

    @GetMapping(value = "/getAllRestaurants")
    public List<Restaurant> getAllRestaurants()
    {
        return restaurantService.getAllRestaurant();
    }

    

    @RequestMapping(value = "/getRestaurantById/{id}",method = RequestMethod.GET)
    public Restaurant getRestaurantById(@PathVariable String id)
    {
        return restaurantService.getRestaurantById(id);
    }

    /////////////////

    @PostMapping(value = "/addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant)
    {
       return  restaurantService.saveRestaurant(restaurant);
    }

    ///////////////////////

    //create a delete endpoint:
    @DeleteMapping(value = "/deleteRestaurantById/{id}")
    public String deleteRestaurantById(@PathVariable String id)
    {
        return restaurantService.deleteRestaurantById(id);
    }

    //////////////////////
    //Updation of restaurant

    @PutMapping(value = "/updateRestaurantById/{id}/{status}")
    public String updateRestaurantStatusById(@PathVariable String id, @PathVariable String status)
    {
        return restaurantService.updateRestaurant(id,status);
    }






}
