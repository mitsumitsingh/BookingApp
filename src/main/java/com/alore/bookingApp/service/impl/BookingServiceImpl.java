package com.alore.bookingApp.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alore.bookingApp.io.entity.HotelsEntity;
import com.alore.bookingApp.model.FilterModel;
import com.alore.bookingApp.model.Hotels;
import com.alore.bookingApp.repository.BookingRepository;
import com.alore.bookingApp.repository.HotelRepository;
import com.alore.bookingApp.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	private static final Logger logger = LoggerFactory.getLogger(BookingServiceImpl.class);

	@PersistenceContext
    private EntityManager em;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public List<HotelsEntity> searchHotels(FilterModel filters) {
		List<HotelsEntity> hotelsEntityList= (List<HotelsEntity>) hotelRepository.findAll();
		StringBuilder sql = new StringBuilder("FROM hotels");
		boolean appendAdd=false;
	    
	    if(filters!=null) {
	    	sql.append(" WHERE");
	    	if(filters.getCity()!=null) {
	    		sql.append(" city = " + " '" + filters.getCity() + "'");
	    		appendAdd=true;
	    		
	    	}
	    	if(filters.getNoOfRoomsRequired()!=0) {
	    		if(appendAdd ==true) {
	    			sql.append(" AND");
	    		}
	    		sql.append(" no_of_rooms_available = " + " " + filters.getNoOfRoomsRequired());
	    	}
	    	if(filters.getNoOfStars()!=0) {
	    		if(appendAdd ==true) {
	    			sql.append(" AND");
	    		}
	    		sql.append(" no_of_stars = " + " " + filters.getNoOfStars());
	    	}
	    	if(filters.getCost()!=0) {
	    		if(appendAdd ==true) {
	    			sql.append(" AND");
	    		}
	    		sql.append(" cost_of_stay = " + " " + filters.getCost());
	    	}
	    	if(filters.isAc()!=false) {
	    		if(appendAdd ==true) {
	    			sql.append(" AND");
	    		}
	    		sql.append(" ac = " + "1");
	    	}
	    	 	
	    }
	    Query query = em.createQuery(sql.toString());
	    logger.info("String is {}",sql);
	    List<HotelsEntity> hotelsEntityListt= (List<HotelsEntity>) query.getResultList();
	    logger.info("hotelsList is {}",hotelsEntityList.get(0).getHotelName());
		List<Hotels> hotelsList= new ArrayList<Hotels>();
		BeanUtils.copyProperties( hotelsList,hotelsEntityList);
		return hotelsEntityListt;
	}
	
}
