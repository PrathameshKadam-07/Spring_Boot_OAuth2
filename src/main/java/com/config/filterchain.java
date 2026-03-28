package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class filterchain {

	
	@Bean
	SecurityFilterChain securityFilterchain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests(auth-> auth
				.requestMatchers("/api/public").permitAll()
				.anyRequest().authenticated())
		
		.oauth2Login(Customizer.withDefaults());
		
		return http.build();
		
	}
}
