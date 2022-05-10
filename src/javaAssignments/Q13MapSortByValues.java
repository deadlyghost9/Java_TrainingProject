package javaAssignments;
//Java Program to Sort a Map By Values

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q13MapSortByValues {
	// function to sort hashmap by values
	public static Map<Integer, String> sortByValue(Map<Integer, String> hm)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<Integer, String> > list = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		
		// Sort the list using lambda expression
		Collections.sort(list,(i1,i2) -> i1.getValue().compareTo(i2.getValue()));

		// put data from sorted list to hashmap
		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();
		for (Map.Entry<Integer, String> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "World");
		map1.put(2, "Planet");
		map1.put(3, "Earth");
		map1.put(4, "Power");
		map1.put(5, "Strong");

		Map<Integer, String> sortedMap = sortByValue(map1);
		for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key: "+key+"\n Value: "+val);
			
		}
	}
}
