package javaAssignments;
//Java Program to Convert String to Date

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Q23StringToDate {
	public static void main(String[] args) {
		String str = "09/05/2022";
		try {
			//Convert using SimpleDateFormat Class and Pattern, use parse to convert the String.
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str);
			System.out.println(" "+date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}
}
