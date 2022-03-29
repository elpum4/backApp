package com.oneApp.backApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackAppApplication {

        public static String PORT = System.getenv("PORT");
        public static String SERVER_URL = System.getenv("SERVER_URL");
	public static void main(String[] args) {
		SpringApplication.run(BackAppApplication.class, args);
	}
}
