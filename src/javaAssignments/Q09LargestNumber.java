package javaAssignments;
//Java Program to Find Largest Element of an Array
import java.util.Arrays;

public class Q09LargestNumber {
	public static void main(String[] args) {
		int[] arr = {2,3,1,44,5,79,23,66,6,78,22,59};
		//Method 1
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(largest < arr[i])
			{
				largest = arr[i];
			}
		}
		System.out.println("Largest Number in Array: "+largest);
		//Method 2 
		Arrays.sort(arr);
		System.out.println("Largest Number in Array using second method: "+arr[arr.length-1]);
	}
}
