package com.practice_Questions;

import java.util.Scanner;

public class StudentsGrade {

		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();

	      
	        System.out.print("Enter marks for Subject 1: ");
	        int sub1 = sc.nextInt();

	        System.out.print("Enter marks for Subject 2: ");
	        int sub2 = sc.nextInt();

	        System.out.print("Enter marks for Subject 3: ");
	        int sub3 = sc.nextInt();

	        double average = (sub1 + sub2 + sub3) / 3.0;

	        System.out.println("\nStudent Name: " + name);
	        System.out.println("Average Marks: " + average);

	        if (average > 75) {
	            System.out.println("Grade: A");
	        } else if (average >= 60) {
	            System.out.println("Grade: B");
	        } else if (average >= 40) {
	            System.out.println("Grade: C");
	        } else {
	            System.out.println("Grade: Fail");
	        }

	        sc.close();
	    }
	}

