package org.geometry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserApp extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		application.properties("spring.application.name=geometry-user-ws.properties");
		return application.sources(UserApp.class);
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserApp.class, args);
	}
}
