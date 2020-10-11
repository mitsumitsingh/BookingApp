package com.alore.bookingApp.service;

import java.util.List;
import com.alore.bookingApp.io.entity.HotelsEntity;
import com.alore.bookingApp.model.FilterModel;

public interface BookingService {
  
	public List<HotelsEntity> searchHotels(FilterModel filters);
}
