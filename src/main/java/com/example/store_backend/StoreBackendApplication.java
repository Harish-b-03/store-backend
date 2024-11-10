package com.example.store_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreBackendApplication {

	//	TODO: In application.properties, get the username and password of the db from env
	public static void main(String[] args) {
		SpringApplication.run(StoreBackendApplication.class, args);
	}

}
