package org.java.coding.programs;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int number  = 0;
		
		System.out.println("Enter the check prime number :-");
		
		number = scan.nextInt();
		
		for (int count = 1; count <number; count++){		
			if(isprimeNumber(count))
				System.out.println("Given Number is prime Number "+count);
			/*else 
				System.out.println("Given Number is not prime Number :- "+number);*/
		}
		scan.close();

	}

	private static boolean isprimeNumber(int number) {
		
		int counter = 2;
		
		while (counter <= number-1){
			
			if(number % counter == 0){
				return false;
			}
			counter++;				
		}
		
		if(number == counter)
			return true;
		else 
			return false;
	}

}
