package examplesOfCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainClass {
	public static void main(String[] args) {
		//List Example
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		//Some Methods
		System.out.println("Size: "+cars.size());
		System.out.println(cars.get(0));
		cars.set(0, "Opel");
		System.out.println(cars);	   
		cars.remove(0);
		System.out.println(cars);	   
		cars.clear();
		System.out.println(cars);	   


		//Map Example
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);

		//Some Methods
		System.out.println(capitalCities.get("England"));
		capitalCities.remove("England");
		System.out.println(capitalCities);

		// Print keys
		System.out.println("Printing Keys:");
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		// Print values
		System.out.println("Printing Values:");
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}

		// Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		
		//Set Example
		HashSet<String> carset = new HashSet<String>();
	    carset.add("Volvo");
	    carset.add("BMW");
	    carset.add("Ford");
	    carset.add("BMW");
	    carset.add("Mazda");
	    System.out.println(carset);
	    
	    //Some Methods
	    System.out.println("Is Mazda Present: "+carset.contains("Mazda"));
	    carset.remove("Volvo");
	    System.out.println(carset);
	    cars.clear();
	    System.out.println(carset);
	}
}
