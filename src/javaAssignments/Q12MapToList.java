package javaAssignments;
//Java Program to Convert Map (HashMap) to List

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q12MapToList {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "World");
		map1.put(2, "Planet");
		map1.put(3, "Earth");
		map1.put(4, "Power");
		map1.put(5, "Strong");
		
		List<Integer> convertedKeys = new ArrayList<Integer>(map1.keySet());
		List<String> convertedValues = new ArrayList<String>(map1.values());
		
		System.out.println("List Key:");
		for (Integer i : convertedKeys) {
			System.out.println(i);
		}
		System.out.println("List Values:");
		for (String string : convertedValues) {
			System.out.println(string);
		}
	}
}
