package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;

	@Override
	public List<Restaurant> getAllRestaurant() {
		// TODO Auto-generated method stub
		return restaurantRepository.getRestaurantsFromDataSource();
	}

	@Override
	public Restaurant getRestaurantById(String id) {
		// TODO Auto-generated method stub
		List<Restaurant> restaurantListRightNow =  restaurantRepository.getRestaurantsFromDataSource();

        for(Restaurant restaurant : restaurantListRightNow)
        {
            if(restaurant.getId().equals(id))
            {
                return restaurant;// multiple IDs may exist
            }
        }

        return null;
	}

	@Override
	public String saveRestaurant(Restaurant restaurant) {
		boolean insertionStatus = restaurantRepository.save(restaurant);// in our case...always true
		if (insertionStatus) {
			return "Restaurant added successfully!!!!!";
		} else {
			return "Failed!!!!!....Restaurant Not possible..Database error";// in case of database error ...will see
																			// later

		}

	}

	@Override
	public String updateRestaurant(String id, String status) {
		// TODO Auto-generated method stub
		// I purposely put all the business logic for update in the dao layer...students
		// are supposed to restructure
		boolean updateStatus = restaurantRepository.update(id, Boolean.parseBoolean(status));

		if (updateStatus) {
			return "Restaurant with id: " + id + " was updated!!!";
		} else {
			return "Restaurant with id: " + id + " does not exist!!!";
		}

	}

	@Override
	public String deleteRestaurantById(String id) {
		// TODO Auto-generated method stub
		boolean deleteResponse = false;
		String status;
		if (id != null) {
			List<Restaurant> restaurantListRightNow = restaurantRepository.getRestaurantsFromDataSource();

			for (Restaurant restaurant : restaurantListRightNow) {
				if (restaurant.getId().equals(id)) {
					deleteResponse = restaurantRepository.remove(restaurant);
					if (deleteResponse) {
						status = "Restaurant with id: " + id + " was deleted!!!";
					} else {
						status = "Restaurant with id: " + id + " was not deleted!!!...Database error";
					}
					return status;
				}
			}

			return "Restaurant with id: " + id + " does not exist!!!";

		} else {
			return "Invalid Id ....Cannot accept Null ID!!";
		}

	}

}
