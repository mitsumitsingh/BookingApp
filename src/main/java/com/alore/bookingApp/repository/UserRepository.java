package com.alore.bookingApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alore.bookingApp.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

	UserEntity findByEmailId(String email);
	
	UserEntity findByEmailIdAndPassword(String email,String password);

}
