package com.practice_Questions;

public class Employee {
	
	    String name;
	    double salary;

	  
	    Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	   
	    public void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Basic Salary: ₹" + salary);
	    }
	}

	
	
