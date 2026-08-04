package com.Interface;

public class Circle  implements Shape {
	
	double radius = 4;
	

	@Override
	public double area() {
        return Math.PI * radius * radius;
    }

}
