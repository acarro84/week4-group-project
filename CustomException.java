package com.skillstorm.training.day3;

public class CustomException extends Exception{

	public CustomException() {
		
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(String message, Throwable cause) {
		super(message, cause);
		
	}
}
