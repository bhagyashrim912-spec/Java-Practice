package com.practice_Questions;

public class Student {

	private String name;
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("Error: Marks should be between 0 and 100.");
		}
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
}
