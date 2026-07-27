package com.practice_Questions;

import java.util.Scanner;

public class ProductBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Product Name: ");
		String productName = sc.nextLine();

		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();

		System.out.print("Enter Price per Unit: ");
		double price = sc.nextDouble();

		double totalBill = quantity * price;
		double discount = 0;
		double finalAmount;

		if (totalBill > 5000) {
			discount = totalBill * 0.10;
		}

		finalAmount = totalBill - discount;

		System.out.println("TOTAL BILL DETAILS");
		System.out.println("Product Name : " + productName);
		System.out.println("Quantity     : " + quantity);
		System.out.println("Price/Unit   : ₹" + price);
		System.out.println("Total Bill   : ₹" + totalBill);
		System.out.println("Discount     : ₹" + discount);
		System.out.println("Final Amount : ₹" + finalAmount);
	}
}
