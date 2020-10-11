package com.alore.bookingApp.service.impl;


import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import com.alore.bookingApp.io.entity.UserEntity;
import com.alore.bookingApp.model.User;
import com.alore.bookingApp.model.UserLoginModel;
import com.alore.bookingApp.repository.UserRepository;
import com.alore.bookingApp.service.UserService;
import com.alore.bookingApp.utils.Utils;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public User createUser(User user) {
		
		if(userRepository.findByEmailId(user.getEmailId())!=null) throw new RuntimeException("Record already exists");
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		String publicUserId = utils.generateUserId(38);
		userEntity.setUserId(publicUserId);
		
		logger.info("userEntity is {}",userEntity);
		UserEntity storedUser = userRepository.save(userEntity);
		
		User storedUserDto = new User();
		BeanUtils.copyProperties(storedUser, storedUserDto);
		
		return storedUserDto;
	}

	@Override
	public User deleteUser(String email) {
		UserEntity userPresent = userRepository.findByEmailId(email);
		if(userPresent!=null) {
			userRepository.delete(userPresent);
			User deletedUser = new User();
			BeanUtils.copyProperties(userPresent, deletedUser);
			return deletedUser;
		}else {
			throw new RuntimeException("Invalid credentials"); 
		}

		
	}

	@SuppressWarnings("unused")
	@Override
	public User logIn(UserLoginModel loginModel) {
		UserEntity loggedInUser = userRepository.
				findByEmailIdAndPassword(loginModel.getEmailId(), loginModel.getPassword());
		if(loggedInUser!=null ) {
			User loggedInUserDto = new User();
			BeanUtils.copyProperties(loggedInUser,loggedInUserDto);
			return loggedInUserDto;
		}else {
			throw new RuntimeException("Invalid credentials"); 
		}
		
	}

	@Override
	public void updateUser(User user) {
		UserEntity userGettingUpdated = userRepository.findByEmailId(user.getEmailId());
		if(userGettingUpdated!=null) {
			UserEntity updatedUser = new UserEntity();
			BeanUtils.copyProperties(user,updatedUser);
			updatedUser.setUserId(userGettingUpdated.getUserId());
			updatedUser.setId(userGettingUpdated.getId());
			userRepository.delete(userGettingUpdated);
			userRepository.save(updatedUser);
			
			
		}
		
	}

}
