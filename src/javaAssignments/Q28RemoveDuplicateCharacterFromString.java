package javaAssignments;

import java.util.HashSet;
import java.util.LinkedHashSet;

//Remove Duplicate characters from string
public class Q28RemoveDuplicateCharacterFromString {
	public static void removeDuplicate(String str) {
		char[] array = str.toCharArray();
		HashSet<Character> set = new LinkedHashSet<Character>();
		//Eliminates Duplicates while adding elements in set.
		for(char c: array) {
			set.add(c);
		}
		//Display the remaining element which are not duplicate.
		for (Character character : set) {
			System.out.print(character);
		}
		
	}
	public static void main(String[] args) {
		String str = "no one leaves this place.".replaceAll(" ", "");
		removeDuplicate(str);
	}
}
