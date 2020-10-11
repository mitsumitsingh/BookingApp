package com.alore.bookingApp.model;
import java.util.Date;

public class FilterModel {
	
	private String city;
	
	private Date date;
	
	private int noOfRoomsRequired;
	
	private int noOfTravellers;
	
	private int noOfStars;
	
	private boolean wifiFacility;
	
	private boolean restaurantAvailable;
	
	private boolean mealsIncluded;
	
	private boolean ac;
	
	private int cost;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNoOfRoomsRequired() {
		return noOfRoomsRequired;
	}

	public void setNoOfRoomsRequired(int noOfRoomsRequired) {
		this.noOfRoomsRequired = noOfRoomsRequired;
	}

	public int getNoOfTravellers() {
		return noOfTravellers;
	}

	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}

	public int getNoOfStars() {
		return noOfStars;
	}

	public void setNoOfStars(int noOfStars) {
		this.noOfStars = noOfStars;
	}

	public boolean isWifiFacility() {
		return wifiFacility;
	}

	public void setWifiFacility(boolean wifiFacility) {
		this.wifiFacility = wifiFacility;
	}

	public boolean isRestaurantAvailable() {
		return restaurantAvailable;
	}

	public void setRestaurantAvailable(boolean restaurantAvailable) {
		this.restaurantAvailable = restaurantAvailable;
	}

	public boolean isMealsIncluded() {
		return mealsIncluded;
	}

	public void setMealsIncluded(boolean mealsIncluded) {
		this.mealsIncluded = mealsIncluded;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	

}
