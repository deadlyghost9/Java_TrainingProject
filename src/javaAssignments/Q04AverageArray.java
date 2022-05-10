package javaAssignments;
//Java Program to Calculate Average Using Arrays
import java.util.Scanner;

public class Q04AverageArray {
	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5,6,4,4,3,2};
		int[] arr = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("Sum : "+sum);
		System.out.println("Average in Array: "+avg);
		scan.close();
	}	
}
