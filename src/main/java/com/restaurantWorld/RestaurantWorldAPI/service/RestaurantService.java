package com.restaurantWorld.RestaurantWorldAPI.service;

import java.util.List;

import com.restaurantWorld.RestaurantWorldAPI.domain.Restaurant;

public interface RestaurantService {

	List<Restaurant> findAll();
	
	void saveOrUpdateRestaurant(Restaurant expense);
	
	void deleteRestaurant(String id);
	
	
}
