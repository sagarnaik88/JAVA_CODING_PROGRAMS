package org.java.coding.programs;

import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Enter the factorial number :-");
		number=scan.nextInt();
		System.out.println("factorial Number is :- "+number);
		
		int fact = 1;
		while(number>0){
			fact = fact*number;
			number --;
		}
		
		System.out.println(fact);
			



		

		
	}

}
