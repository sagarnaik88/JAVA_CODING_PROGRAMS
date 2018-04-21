package org.java.coding.programs;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = 0;

		System.out.println("Enter the Original Number");

		number = scan.nextInt();

		System.out.println("Original Number is :-" + number);

		int reverse = 0, reminder = 0;

		do {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		} while (number != 0);

		System.out.println("reverse no is := " + reverse);
		scan.close();
	}

}
