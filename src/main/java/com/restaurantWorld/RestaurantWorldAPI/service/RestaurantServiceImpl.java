package com.restaurantWorld.RestaurantWorldAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantWorld.RestaurantWorldAPI.domain.Restaurant;
import com.restaurantWorld.RestaurantWorldAPI.repositories.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public List<Restaurant> findAll() {
		return restaurantRepository.findAll();
	}

	@Override
	public void saveOrUpdateRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

	@Override
	public void deleteRestaurant(String id) {
		// TODO Auto-generated method stub
		
	}
}
