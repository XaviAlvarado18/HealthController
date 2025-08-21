package com.example.HealthController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.HealthController", "controller.health"})
public class HealthControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthControllerApplication.class, args);
	}

}
