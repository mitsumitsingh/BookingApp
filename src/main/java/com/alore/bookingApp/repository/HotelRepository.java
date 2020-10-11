package com.alore.bookingApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.alore.bookingApp.io.entity.HotelsEntity;

public interface HotelRepository extends CrudRepository<HotelsEntity,Long> {

	HotelsEntity findByHotelName(String hotelName);
}
