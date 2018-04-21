package org.java.coding.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dateNow = new Date();
		
		System.out.println("Original Date :- "+dateNow);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String dateformatchange = format.format(dateNow);
		
		System.out.println("date format is yyyymmdd "+dateformatchange);
		
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMyyyy");
		dateformatchange = format1.format(dateNow);
		
		System.out.println("format is  ddMMyyyy :- "+ dateformatchange);
		

	}

}
