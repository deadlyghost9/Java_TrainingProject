package javaAssignments;
//Java Program to Generate Multiplication Table
import java.util.Scanner;

public class Q16MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = scan.nextInt();
		System.out.println("Enter Multiplication Range");
		int range = scan.nextInt();
		System.out.println("Multiplication Table of "+number+" to "+range);
		for (int i = 0; i < range; i++) {
			System.out.println(number+" * "+(i+1)+" = "+(number*(i+1)));
		}
		scan.close();
	}
}
