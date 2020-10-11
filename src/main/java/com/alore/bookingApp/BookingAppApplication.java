package com.alore.bookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingAppApplication.class, args);
	}

}
