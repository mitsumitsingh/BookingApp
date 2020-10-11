package com.alore.bookingApp.utils;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	private final Random random = new SecureRandom();
	private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public String generateUserId(int length) {
		return generateRandomStringId(length);
	}
	
	public String generateRandomStringId(int length) {
		StringBuilder returnedValue = new StringBuilder(38);
		for(int i=0;i<length;i++) {
			returnedValue.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
		}
		return new String(returnedValue);
	}
}
