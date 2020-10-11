package com.alore.bookingApp.model;

public class Hotels {

	private String hotelName;
	
	private String city;
	
	private boolean availability;
	
	private int noOfRoomsAvailable;
	
	private int noOfStars;
	
	private boolean wifiFacility;
	
	private boolean ac;
	
	private boolean mealsIncluded;
	
	private int costOfStay;
	
	private boolean restaurantAvailable;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public int getNoOfRoomsAvailable() {
		return noOfRoomsAvailable;
	}

	public void setNoOfRoomsAvailable(int noOfRoomsAvailable) {
		this.noOfRoomsAvailable = noOfRoomsAvailable;
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

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public boolean isMealsIncluded() {
		return mealsIncluded;
	}

	public void setMealsIncluded(boolean mealsIncluded) {
		this.mealsIncluded = mealsIncluded;
	}

	public int getCostOfStay() {
		return costOfStay;
	}

	public void setCostOfStay(int costOfStay) {
		this.costOfStay = costOfStay;
	}

	public boolean isRestaurantAvailable() {
		return restaurantAvailable;
	}

	public void setRestaurantAvailable(boolean restaurantAvailable) {
		this.restaurantAvailable = restaurantAvailable;
	}

	@Override
	public String toString() {
		return "Hotels [hotelName=" + hotelName + ", city=" + city + ", availability=" + availability
				+ ", noOfRoomsAvailable=" + noOfRoomsAvailable + ", noOfStars=" + noOfStars + ", wifiFacility="
				+ wifiFacility + ", ac=" + ac + ", mealsIncluded=" + mealsIncluded + ", costOfStay=" + costOfStay
				+ ", restaurantAvailable=" + restaurantAvailable + "]";
	}
	
}
