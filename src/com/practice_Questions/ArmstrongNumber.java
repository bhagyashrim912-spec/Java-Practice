package com.practice_Questions;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}

		return sum == originalNum;
	}

}
