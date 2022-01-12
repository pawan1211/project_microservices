package com.spring.advertise.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class InvalidAuthorizationTokenException extends RuntimeException {
	private String message;

	public InvalidAuthorizationTokenException() {
		this.message = "";
	}
	public InvalidAuthorizationTokenException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Invalid Authorization Token: " + this.message;
	}
}