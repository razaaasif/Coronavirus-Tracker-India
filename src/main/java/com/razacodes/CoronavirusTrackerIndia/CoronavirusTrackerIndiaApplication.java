package com.razacodes.CoronavirusTrackerIndia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerIndiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerIndiaApplication.class, args);
	}

}
