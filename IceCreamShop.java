package com.skillstorm.training.day3;


	

	/*
	REQUIREMENTS
	- Defines properties such as ice cream flavors, name, and address
	- Have the data be fully encapsulated via private fields and public getters and setters
	- Have the ability to create multiple IceCreamShop objects and have their data be independent of one another
	- Possess the ability to run out of and restock ice cream flavors through publicly accessible methods on the IceCreamShop class
	- Prevent the addition of null entities to the ice cream flavors array 
	- Override the toString method to allow the printing of an IceCreamShop object
	- Override the equals method to compare two IceCreamShop objects (only compare the array of flavors not any other properties such as name)
	BONUS
	- Prevent the addition of null entities with an if-statement that throws an IllegalArgumentException
	- In a separate test class, write a main method and use try-catch to call the method and handle the exception
	*/
	public class IceCreamShop {
	
		// Static properties
		private static int numShops;
		private static final int MAX_CAPACITY = 31;
		private String[] flavors = new String[MAX_CAPACITY];
		private String name;
		private String address;
		private int numFlavorsInStock;
		
		public IceCreamShop() {
			this("TBD", "unknown");
		}
		public IceCreamShop(String name, String address) {
			this.setName(name);
			this.setAddress(address);
			numShops++;
			
			}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String[] getFlavors() {
			return flavors;
		}
	
		public static int getNumShops() {
			return IceCreamShop.numShops;
		}
		
				
		
		//---------------------------------------------------------------
		// Define properties such as ice cream flavors, name, and address
		// Instance Properties
		
		
		
		//---------------------------------------------------------------
		// Has the ability to create multiple IceCreamShop objects and have their data be independent of one another
		// Constructors
		
		
		
		//---------------------------------------------------------------
		// The data is fully encapsulated via private fields and public getters and setters
		// Getters and Setters
		
		// Prevent the addition of null entities to the ice cream flavors array
		
		
		
		//---------------------------------------------------------------
		// Has the ability to run out of and restock ice cream flavors through publicly accessible methods
		// Methods
		
		
		//---------------------------------------------------------------
		// Override the toString method
		@Override
		public String toString() {
			String result = "";
			result += "Name: " + this.name + "\n";
			result += "Address: " + this.address + "\n";
			result += this.numFlavorsInStock + " flavors available: \n";
			for (int i = 0; i < this.numFlavorsInStock; i++) {
				result += this.flavors[i] + ", ";
			}
			result = result.substring(0, result.length() - 2);
			return result; 
		}
		
		
		//---------------------------------------------------------------
		// Override the equals method to compare two IceCreamShop objects (only compare the array of flavors)
		
	
	}
