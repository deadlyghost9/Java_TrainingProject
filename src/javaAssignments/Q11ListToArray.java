package javaAssignments;
//Java Program to Convert List (ArrayList) to Array and Vice-Versa

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11ListToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Power");
		list.add("Money");
		list.add("Health");
		
		String[] str = (String[]) list.toArray(new String[list.size()]);
		
		System.out.println("Printing String Array:");
		for (String string : str) {
			System.out.println(string);
		}
		
		String[] array = {"Uranus","Pluto","Earth","Planets","World"};
		
		List<String> convertedList = Arrays.asList(array);
		
		System.out.println("Printing Converted List:");
		for (String string : convertedList) {
			System.out.println(string);
		}
	}
}
