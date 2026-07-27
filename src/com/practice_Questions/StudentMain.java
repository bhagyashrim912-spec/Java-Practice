package com.practice_Questions;

public class StudentMain {
	
	 public static void main(String[] args) {
	        Student student = new Student();

	        student.setName("Rahul");
	        student.setMarks(85);

	        System.out.println("Student Name: " + student.getName());
	        System.out.println("Marks: " + student.getMarks());

	        student.setMarks(120);
	    }

}
