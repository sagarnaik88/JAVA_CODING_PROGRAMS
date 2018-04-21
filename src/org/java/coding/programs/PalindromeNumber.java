package org.java.coding.programs;

import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  = new Scanner (System.in);
		int number = 0;
		
		System.out.println("Enter Palindrome Number :-");
		number = scan.nextInt();
		
		System.out.println("number is :- "+number);
		
		if(isPalindrome(number)){
			System.out.println("Given number is Palindrome ");			
		}else{
			
			System.out.println("Given Number is not Palindrome ");	
		}
		scan.close();

	}

	private static  boolean isPalindrome(int number) {
		
		int OrigianNum = number;
		
		int revers = 0, reminder=0;
		do{
			reminder = number % 10;
			revers = revers * 10 + reminder;
			number = number / 10;			
		}while (number != 0);
		
		if(OrigianNum == revers)
			return true;
		else 
			return false;					
	}

}
