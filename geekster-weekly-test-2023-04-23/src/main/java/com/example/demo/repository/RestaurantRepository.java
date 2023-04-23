package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Restaurant;

@Repository
public class RestaurantRepository {

	private List<Restaurant> restaurantList;

	public RestaurantRepository() {
		restaurantList = new ArrayList<>();
		// not needed ...done for testing
		restaurantList.add(new Restaurant("0", "santosh-restaurant", "hyderabad", 234789560, "swiming-fool", 20));

	}

	public List<Restaurant> getRestaurantsFromDataSource() {
		return restaurantList;
	}

	public boolean save(Restaurant restaurant) {
		restaurantList.add(restaurant);// mock Database call
		return true;
	}

	public boolean remove(Restaurant restaurant) {
		restaurantList.remove(restaurant);// mock a database
		return true;
	}

	public boolean update(String id, boolean status) {
		boolean updateStatus = false;
		for (Restaurant restaurant : restaurantList) {
			if (restaurant.getId().equals(id)) {
				// my simple update logic
				// remove original :
				remove(restaurant);

				// change this restaurant now
				restaurant.setRestaurantStatus(status);

				// add this new restaurant :
				save(restaurant);

				return true;// not mocking the database here to keep things simple.

			}

		}
		
		return false;
	}

}
