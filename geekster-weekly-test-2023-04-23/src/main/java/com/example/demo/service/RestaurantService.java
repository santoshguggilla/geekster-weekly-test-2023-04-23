package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Restaurant;

public interface RestaurantService {

	public List<Restaurant> getAllRestaurant();

	public Restaurant getRestaurantById(String id);

	public String saveRestaurant(Restaurant restaurant);

	public String updateRestaurant(String id, String status);

	public String deleteRestaurantById(String id);
}
