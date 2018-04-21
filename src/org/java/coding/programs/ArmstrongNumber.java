package org.java.coding.programs;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter the three digit Number :-");
		number = scan.nextInt();

		if (isArmstrong(number))
			System.out.println("Given Number is Armstrong ");
		else
			System.out.println("Given number is not Armstrong ");
		scan.close();
		System.out.println("test");
	}

	private static boolean isArmstrong(int number) {
		// TODO Auto-generated method stub
		int origianalNum = number;
		int sum = 0, reminder = 0;
		do {
			reminder = number % 10;
			sum = sum + (reminder * reminder * reminder);
			number = number / 10;
		} while (number != 0);
		if (sum == origianalNum)
			return true;
		else
			return false;
	}
}
