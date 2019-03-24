package com.restaurantWorld.RestaurantWorldAPI.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Restaurant {
	
	@Id
	Integer restaurantID;
	String restaurantName;
	String cuisines;
	String avgCostForTwo;
	String currency;
	String hasTableBooking;
	String hasOnlineDelivery;
	double aggregateRating;
	String ratingColor;
	String ratingText;
	int votes;
	
	public Integer getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(Integer restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	public String getAvgCostForTwo() {
		return avgCostForTwo;
	}
	public void setAvgCostForTwo(String avgCostForTwo) {
		this.avgCostForTwo = avgCostForTwo;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String isHasTableBooking() {
		return hasTableBooking;
	}
	public void setHasTableBooking(String hasTableBooking) {
		this.hasTableBooking = hasTableBooking;
	}
	public String isHasOnlineDelivery() {
		return hasOnlineDelivery;
	}
	public void setHasOnlineDelivery(String hasOnlineDelivery) {
		this.hasOnlineDelivery = hasOnlineDelivery;
	}
	public double getAggregateRating() {
		return aggregateRating;
	}
	public void setAggregateRating(double aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
	public String getRatingColor() {
		return ratingColor;
	}
	public void setRatingColor(String ratingColor) {
		this.ratingColor = ratingColor;
	}
	public String getRatingText() {
		return ratingText;
	}
	public void setRatingText(String ratingText) {
		this.ratingText = ratingText;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}

}
