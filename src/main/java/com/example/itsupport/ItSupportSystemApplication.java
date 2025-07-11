package com.example.itsupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ItSupportSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItSupportSystemApplication.class, args);
	}

}
