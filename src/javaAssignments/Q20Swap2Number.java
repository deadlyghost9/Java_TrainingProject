package javaAssignments;
//Java Program to Swap Two Numbers
public class Q20Swap2Number {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		//Swap method one.
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Swapped a: "+a);
		System.out.println("Swapped b: "+b);
		
		int x = 10;
		int y = 30;
		
		//Swap method two.
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("Swapped x: "+x);
		System.out.println("Swapped y: "+y);
	}
}
