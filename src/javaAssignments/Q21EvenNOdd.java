package javaAssignments;
//Java Program to Check Whether a Number is Even or Odd
public class Q21EvenNOdd {
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int number = 20;
		if(isEven(number)) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}
}
