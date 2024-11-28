package com.innov.atelier13swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	public OpenAPI apiInfo() {
		return new OpenAPI().info(new Info().title("Test API documentation")
		.description("Documentation for Test API")
		.version("v1"));
	}
	
}
