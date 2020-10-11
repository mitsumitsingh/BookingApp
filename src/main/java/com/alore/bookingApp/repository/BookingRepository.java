package com.alore.bookingApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.alore.bookingApp.io.entity.HotelsEntity;

@Repository
public interface BookingRepository extends CrudRepository<HotelsEntity, Long> {

}
