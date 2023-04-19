package com.skillstorm.training.day3;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsReview {

	public static void main(String[] args) throws IOException {
		/*
		 * What is an exception? - something that occurs during the execution of the
		 * program that interrupts the normal flow
		 * 
		 * 
		 * 
		 * What are some exceptions we've seen? - unchecked --ArithmeticException
		 * --ClassCastException --Runtime Exception
		 * 
		 * - checked --Throwable --Exception --IOException
		 * 
		 * 
		 * Exception Objects can have certain properties - String message - Throwable
		 * cause - stacktrace (method that calculates method stack) - getClass() -- the
		 * type is important to our user to understand what went wrong
		 * 
		 *
		 * Why does java throw exceptions what's the point? - because something
		 * unexpected happened and we need to communicate that to our user - checked
		 * exceptions -- to enforce best practices
		 * 
		 * 
		 * Question: Is and Infinite Loop an exception? - no
		 * 
		 * 
		 * Question: What happens if a catch block's code throws an exception? -
		 * Propagate down the call stack to the next method in the stack and potentially
		 * main
		 * 
		 * 
		 */
		// Example 1: Throw an exception of your choosing
//		throw new IOException("Something went wrong");
		// Example 1b: throwing an exception with a cause
//		throw new RuntimeException("Something went wrong, sorry", 
//									new Exception("this was what happened."));
		// Example 2: Thrown exception in catch block
//		try {
//			throw new ArithmeticException("1");
//
//		} catch (ArithmeticException e) {
//			throw new ArithmeticException("2");
//		}
	// Example 2b: Thrown exception in catch block
		try {
			throw new ArithmeticException("1");
		} catch (ArithmeticException e) {
			throw new ArrayIndexOutOfBoundsException("2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught exception " + e.getLocalizedMessage());
		} finally {
			
			System.out.println("Reached finally block");
		}
		System.out.println("Reached end of main");
	
	}

}