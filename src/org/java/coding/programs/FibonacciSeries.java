package org.java.coding.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);;
		int counter = 0, i =0, j =1, sum=0;
		System.out.println("Enter the number upto print Febonacci series");
		
		counter=scan.nextInt();
		
		System.out.println("counter"+counter);
		System.out.println("0");
		System.out.println("1");
		
		while (counter>0){
			
			sum=i+j;
			System.out.println(sum);
			i=j;
			j=sum;
			counter--;			
		}
		scan.close();			
	}

}
