package com.alore.bookingApp.service;

import com.alore.bookingApp.model.User;
import com.alore.bookingApp.model.UserLoginModel;

public interface UserService {
	
	public User createUser(User user);
	
	public User deleteUser(String email);
	
	public void updateUser(User user);
	
	public User logIn(UserLoginModel loginModel);
	

}
