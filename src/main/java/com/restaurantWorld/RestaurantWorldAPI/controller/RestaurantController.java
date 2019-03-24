package com.restaurantWorld.RestaurantWorldAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantWorld.RestaurantWorldAPI.domain.Restaurant;
import com.restaurantWorld.RestaurantWorldAPI.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		List<Restaurant> result = restaurantService.findAll();
		return new ResponseEntity(result, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> addorUpdateRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.saveOrUpdateRestaurant(restaurant);
		return new ResponseEntity("Added Restaurant", HttpStatus.OK);
	}
	
}
