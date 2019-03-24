package com.restaurantWorld.RestaurantWorldAPI.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restaurantWorld.RestaurantWorldAPI.domain.Restaurant;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

}
