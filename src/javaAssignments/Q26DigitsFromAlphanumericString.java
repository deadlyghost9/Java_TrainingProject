package javaAssignments;
//Get digits from alphanumeric String

public class Q26DigitsFromAlphanumericString {
	public static void extractNumber(String str) {
		//Replace each non-numeric number with a space
		str = str.replaceAll("[^\\d]", " ");
		//Remove leading and trailing spaces
		str = str.trim();
		// Replace consecutive spaces with a single space
        str = str.replaceAll(" +", " "); 
		//printing string.
        System.out.println(str);
	}
	public static void main(String[] args) {
		String str = "21,Friday,2012,21 Jump Street,22 Jump Street";
		extractNumber(str);
	}
}
