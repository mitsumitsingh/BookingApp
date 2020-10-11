package com.alore.bookingApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alore.bookingApp.model.Hotels;
import com.alore.bookingApp.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	private static final Logger logger = LoggerFactory.getLogger(HotelController.class);

	@Autowired
	HotelService hotelService;
	
	@RequestMapping(value="/addHotels",method = RequestMethod.POST)
	public Hotels addHotel(@RequestBody Hotels hotel) {
		logger.info(hotel.toString());
	    Hotels createdHotel = hotelService.addHotel(hotel);
	    return createdHotel;
	}
	
	@RequestMapping(value="/updateHotel",method = RequestMethod.PUT)
	public void updateHotel(@RequestBody Hotels hotel) {
		hotelService.updateHotel(hotel);
	}
	
	@RequestMapping(value="/deleteHotel",method= RequestMethod.DELETE)
	public void deleteHotel(@RequestParam String hotelName) {
		hotelService.deleteHotel(hotelName);
	}
}
