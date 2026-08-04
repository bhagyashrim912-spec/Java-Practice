package com.Interface;

public class Dog implements Animal {

	@Override
	public void eat() {
	 System.out.println("Dog Barks");
		
	}

	@Override
	public void sound() {
		 System.out.println("Dog eats meat");
		
	}

}
