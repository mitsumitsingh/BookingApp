package com.alore.bookingApp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alore.bookingApp.io.entity.HotelsEntity;
import com.alore.bookingApp.model.Hotels;
import com.alore.bookingApp.repository.HotelRepository;
import com.alore.bookingApp.service.HotelService;
import com.alore.bookingApp.utils.Utils;

@Service
public class HotelServiceImpl implements HotelService{
	
	private static final Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);

	@Autowired
	HotelRepository hotelrepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public Hotels addHotel(Hotels hotel) {
		
		if(hotelrepository.findByHotelName(hotel.getHotelName())!=null) throw new RuntimeException("Record already exists");
		
		HotelsEntity hotelEntity = new HotelsEntity();
		BeanUtils.copyProperties(hotel, hotelEntity);
		
		String publicHotelId = utils.generateUserId(38);
	    hotelEntity.setHotelId(publicHotelId);
		HotelsEntity storedHotel = hotelrepository.save(hotelEntity);
		logger.info("hotels added is ", hotel);
		Hotels storedHotelDto = new Hotels();
		BeanUtils.copyProperties(storedHotel, storedHotelDto);
		
		return storedHotelDto;
	}

	@Override
	public void updateHotel(Hotels hotel) {
		HotelsEntity hotelGettingUpdated = hotelrepository.findByHotelName(hotel.getHotelName());
		if(hotelGettingUpdated!=null) {
			HotelsEntity updatedHotel = new HotelsEntity();
			BeanUtils.copyProperties(hotel,updatedHotel);
			updatedHotel.setAc(hotel.isAc());
			updatedHotel.setAvailability(hotel.isAvailability());
            updatedHotel.setCity(hotel.getCity());
            updatedHotel.setCostOfStay(hotel.getCostOfStay());
            updatedHotel.setHotelId(hotelGettingUpdated.getHotelId());
            updatedHotel.setHotelName(hotel.getHotelName());
            updatedHotel.setId(hotelGettingUpdated.getId());
            updatedHotel.setNoOfRoomsAvailable(hotel.getNoOfRoomsAvailable());
            updatedHotel.setNoOfStars(hotel.getNoOfStars());
            updatedHotel.setRestaurantAvailable(hotel.isRestaurantAvailable());
            updatedHotel.setWifiFacility(hotel.isWifiFacility());
            updatedHotel.setMealsIncluded(hotel.isMealsIncluded());
           
			hotelrepository.delete(hotelGettingUpdated);
			hotelrepository.save(updatedHotel);
			
			
		}
		
	}

	@Override
	public Hotels deleteHotel(String hotelName) {
		HotelsEntity hotelGettingDeleted = hotelrepository.findByHotelName(hotelName);
		if(hotelGettingDeleted!=null) {
			hotelrepository.delete(hotelGettingDeleted);
			Hotels deletedUser = new Hotels();
			BeanUtils.copyProperties(hotelGettingDeleted, deletedUser);
			return deletedUser;
		}else {
			throw new RuntimeException("Invalid credentials"); 
		}
	}

}
