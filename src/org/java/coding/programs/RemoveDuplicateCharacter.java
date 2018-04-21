package org.java.coding.programs;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		String word = scan.next();		
		System.out.println("Original String :---"+word);		
		String retrunSTring = removeduplicates(word);		
		System.out.println("remove duplicate STring  :- "+retrunSTring.toString());
		scan.close();
	}	
	public static String removeduplicates(String input){
		String str = new String();
		int len = input.length();
		char c;
		for (int i =0; i<len ; i++){
			c = input.charAt(i);
			System.out.println("value of C :- "+c);
			if(str.indexOf(c) < 0){
				System.out.println("Value of i :- "+i);
				str = str+c;
			}
		}
		return str.toString();		
	}

}
