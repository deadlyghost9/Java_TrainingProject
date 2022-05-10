package javaAssignments;
//Check Whether a string is Palindrome or Not
import java.util.Scanner;

public class Q03Palindrome {
	public static void main(String[] args) {
		String str1;
		StringBuffer str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		str1 = scan.next();
		str = new StringBuffer(str1);
		if(str1.equals(str.reverse().toString())) {
			System.out.println(str+" is Palindrome");
		} else {
			System.out.println(str+" is not Palindrome");
		}
		scan.close();
	}
}
