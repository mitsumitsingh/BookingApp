package com.alore.bookingApp.service;

import com.alore.bookingApp.model.Hotels;

public interface HotelService {

	public Hotels addHotel(Hotels hotel);
	
	public void updateHotel(Hotels hotel);
	
	public Hotels deleteHotel(String hotelName);
}
