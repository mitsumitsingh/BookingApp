package com.alore.bookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alore.bookingApp.model.User;
import com.alore.bookingApp.model.UserLoginModel;
import com.alore.bookingApp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
    @RequestMapping(value="/addUser",method = RequestMethod.POST)
	public User createUser(@RequestBody User  userDetails) {
		User createdUser = userService.createUser(userDetails);
		return createdUser;
		
	}
	
    @RequestMapping(value="/updateUser",method = RequestMethod.PUT)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
		
	}
	
    @RequestMapping(value="/deleteUser",method = RequestMethod.DELETE)
	public User deleteUser(@RequestParam String email) {
		return userService.deleteUser(email);
	}
	
    @RequestMapping(value="/logIn",method = RequestMethod.GET)
	public User logIn(@RequestBody UserLoginModel loginModel) {
		User loggedInUser = userService.logIn(loginModel);
		return loggedInUser;
	}

    @RequestMapping("/addReview")
	public void addReview() {
		
	}
	
	@RequestMapping("/deleteReview")
	public void deleteReview() {
		
	}
}
