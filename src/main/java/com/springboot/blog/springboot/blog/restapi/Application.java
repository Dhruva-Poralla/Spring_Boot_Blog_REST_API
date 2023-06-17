package com.springboot.blog.springboot.blog.restapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
			title = "Spring Boot Blog Rest API's",
			description = "Spring Boot Blog Rest API's Doc",
			version = "v1.0",
			contact = @Contact(
					name = "Dhruva",
					email = "poralladhruva@gmail.com"
			)
	)
)
public class Application {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
