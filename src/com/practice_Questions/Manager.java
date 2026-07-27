package com.practice_Questions;

	
	public class Manager extends Employee {

	    double bonus;

	    Manager(String name, double salary, double bonus) {
	        super(name, salary);
	        this.bonus = bonus;
	    }

	   
	    public void calculateTotalSalary() {
	        double totalSalary = salary + bonus;

	        displayDetails();
	        System.out.println("Bonus: ₹" + bonus);
	        System.out.println("Total Salary: ₹" + totalSalary);
	    }
	}


