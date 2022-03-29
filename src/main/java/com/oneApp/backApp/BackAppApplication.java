package com.oneApp.backApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BackAppApplication extends SpringBootServletInitializer {

        public static void main(final  String[] args) {
		SpringApplication.run(BackAppApplication.class, args);
	}
        
         @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BackAppApplication.class);
        }
}
