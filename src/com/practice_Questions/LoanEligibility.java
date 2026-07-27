package com.practice_Questions;
import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (salary > 25000 && age >= 21 && age <= 60) {
            System.out.println("Eligible for Loan");
        } else {
            System.out.println("Not Eligible for Loan");
        }

        sc.close();
    }
}
