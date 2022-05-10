package javaAssignments;
//How to Convert List into Array and Arrya to List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q25ArrayToList {
	public static void main(String[] args) {
		
		String[] array = {"Uranus","Pluto","Earth","Planets","World"};

		List<String> convertedList = Arrays.asList(array);

		System.out.println("Printing Converted List:");
		for (String string : convertedList) {
			System.out.println(string);
		}
		List<String> list = new ArrayList<String>();
		list.add("Power");
		list.add("Money");
		list.add("Health");

		String[] str = (String[]) list.toArray(new String[list.size()]);

		System.out.println("Printing String Array:");
		for (String string : str) {
			System.out.println(string);
		}

	}
}
