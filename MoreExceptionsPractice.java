package com.skillstorm.training.day3;

import java.io.IOException;

public class MoreExceptionsPractice {

	public static void main(String[] args) throws IOException, CustomException {
		// TODO Auto-generated method stub
		// Example 1: Throwing a Built-in checked exception
//		throw new IOException();
		throw new CustomException("Uhoh", new IOException("Didn't work for some reason"));
		
	}

}
