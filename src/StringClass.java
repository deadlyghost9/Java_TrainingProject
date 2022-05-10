
public class StringClass {
	public static void main(String[] args) {
        // Declare String without using new operator
        String s = "Geeks for Geeks";
 
        // Prints the String.
        System.out.println("String s = " + s);
 
        // Declare String using new operator
        String s1 = new String("Geeks for Geeks");
 
        // Prints the String.
        System.out.println("String s1 = " + s1);
        
        //Methods of String
        System.out.println(s.isBlank()); //check if the string is blank or not.
        System.out.println(s.isEmpty()); //check if the string is empty or not.
        System.out.println(s.equals(s1)); //for comparison if the strings are equal or not.
        System.out.println(s.toUpperCase()); //to put all the characters in UpperCase.
        System.out.println(s.toLowerCase()); //to put all the characters in lowercase.
        System.out.println(s.charAt(1)); //selects single character based on the index.
        System.out.println(s.contains("for")); //to search small string/words is present in the string.
        System.out.println(s.concat(s1)); //To join two strings in one string.
        System.out.println(s.length()); //returns string length.
        System.out.println(s.replaceAll(" ", "/")); //to replace a string/character in string.
        System.out.println(s.split(s)); // returns array of string 
        //Etc.
        
        //StringBuffer and StringBuilder
        StringBuffer str = new StringBuffer("GeeksforGeeks");
        System.out.println("Before Append StringBuffer- "+str);
        str.append(".com");
        System.out.println("After Append StringBuffer- "+str);
        str.reverse();
        System.out.println("After Reverse StringBuffer- "+str);
        
        
	}
}
