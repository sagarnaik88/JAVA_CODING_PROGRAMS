package org.java.coding.programs;

import java.util.*;

public class StringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		String string = null;
		System.out.println("Enter the string we want to reverse:- ");
		string = scan.next();
		System.out.println("Original String is :- "+string);
		
		//Reverse String using stringBuffer
		
		String reverseStr = new StringBuffer(string).reverse().toString();
		System.out.println("String Buffer Example :- "+reverseStr);
		
		//iterative method to reverse String in Java
		reverseStr = reverse (string);
		System.out.println("Reverse String in interative :-"+reverseStr);
		
		//recursive method to reverse String in Java
		
		reverseStr = reverseRecursively(string);
		System.out.println("String Recursively function :-"+reverseStr);
		
		scan.close();
		
			

	}

	private static String reverseRecursively(String string) {
		
		//base case to handle one char string and empty string
        if (string.length() < 2) {
            return string;
        }
        
        System.out.println("string sisssss ----"+string.substring(1));
        System.out.println("ddddddddd   ----"+string.charAt(0));

        return reverseRecursively(string.substring(1)) + string.charAt(0);
		
	}

	private static String reverse(String string) {
		// TODO Auto-generated method stub
		 
		StringBuffer reverse = new StringBuffer();
		char [] charArray = string.toCharArray();
		int length = string.length();
				
		for(int i = length-1; i>=0; i--)
			reverse.append(charArray[i]);
		return reverse.toString();				
	}

}
