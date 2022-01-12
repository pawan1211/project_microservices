package com.spring.advertise.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@Service
public class UserServiceCiruitDelegateImpl  {
/*
	@Autowired
	RestTemplate restTemplate;
    @Autowired
	CircuitBreakerFactory circuitBreakerFactory;

	
	public Map findByUsername(String username) {
		return this.restTemplate.getForObject("http://localhost:8095/" + username, Map.class);
	}

	public boolean isLoggedInUser(String authToken) {
		CircuitBreaker circuitBreaker = circuitBreakerFactory.create("userCircuitBreaker");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authToken);
		HttpEntity entity = new HttpEntity(headers);
	ResponseEntity<Boolean> response = circuitBreaker.run(
		this.restTemplate.exchange("http://UNKNOWN/token/validate",  HttpMethod.GET, entity, Boolean.class);
			throwable -> fallbackForIsLoggedInUser(authToken,throwable)
		);
		return response.getBody();
	}

	@Bean
	//@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	public ResponseEntity<Boolean>  fallbackForIsLoggedInUser(String authToken,Throwable throwable) {
		System.out.println("Circuit Breaker: Failure ");
		return new ResponseEntity<Boolean> (false,HttpStatus.INTERNAL_SERVER_ERROR);
	} 
*/
}
