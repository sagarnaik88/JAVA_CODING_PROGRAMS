package org.java.coding.programs;

import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Original String String :- ");		
		String Word = scan.next();
		System.out.println("Original String is :- "+Word);
				
		boolean b= checkStringPalindrome(Word);
		
		if(b)
			System.out.println("-- String is palindram --");
		else
			System.out.println("-- String is not palindrome --");
		
	}
	
	private static boolean checkStringPalindrome(String originalString){
		
		String mainstring = originalString;
		char[] toCharArray = originalString.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		int len = originalString.length()-1;
		for(int i = len;  i >=0; i--){
			sb.append(toCharArray[i]);
		}		
		if(sb.toString().equals(mainstring))
			return true;
		else
			return false;	
	}

}
