package com.alore.bookingApp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.alore.bookingApp.io.entity.HotelsEntity;
import com.alore.bookingApp.model.FilterModel;
import com.alore.bookingApp.service.BookingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/searchHotels")
public class BookingAppController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping
	public List<HotelsEntity> searchHotels(@RequestBody FilterModel filter) {
		
		return (List<HotelsEntity>) bookingService.searchHotels(filter);
	}
	

}
