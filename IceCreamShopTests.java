package com.skillstorm.training.day3;

public class IceCreamShopTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCreamShop jenisShop = new IceCreamShop("Jeni's", "123 Broadway");
		System.out.println(jenisShop);
		
		IceCreamShop myShop = new IceCreamShop();
		System.out.println(myShop);
		
		myShop.setName("Culvers");
		myShop.setAddress("123 Main");
		System.out.println(myShop);
		
		System.out.println("There are now: " + IceCreamShop.getNumShops() + " shops.");
	}

}
