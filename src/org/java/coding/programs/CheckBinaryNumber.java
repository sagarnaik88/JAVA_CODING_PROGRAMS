package org.java.coding.programs;

import java.util.*;

public class CheckBinaryNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (checkBinaryNumber(number))
			System.out.println("Given number is Binary Format :- " + number);
		else
			System.out.println("Given Number is not Binary Format :- " + number);
		scan.close();
	}

	private static boolean checkBinaryNumber(int number) {

		while (number != 0) {
			if (number % 10 > 1)
				return false;
			number /= 10;
		}
		return true;
	}

}
