package com.alore.bookingApp.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="hotels")
public class HotelsEntity implements Serializable{

	private static final long serialVersionUID = -7536028294473983906L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String hotelId;
	
	@Column(nullable=false,length = 100)
    private String hotelName;
	
	@Column(nullable=false,length = 100)
	private String city;
	
	@Column(nullable=false)
	private boolean availability;
	
	@Column(nullable=false)
	private int noOfRoomsAvailable;
	
	@Column(nullable=false)
	private int noOfStars;
	
	@Column(nullable=false)
	private boolean wifiFacility;
	
	@Column(nullable=false)
	private boolean ac;
	
	@Column(nullable=false)
	private boolean mealsIncluded;
	
	@Column(nullable=false)
	private int costOfStay;
	
	@Column(nullable=false)
	private boolean restaurantAvailable;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

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
	
	

}
