package com.practice_Questions;

public class AreaCalculator {

	public void area(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle = " + area);
	}

	public void area(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of Rectangle = " + area);
	}

	public void area(double base, int height) {
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle = " + area);
	}

}
