package javaAssignments;
//Java Program to Check if An Array Contains a Given Value
import java.util.Scanner;


public class Q08ContainsArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,2,1,3,1,3,4,1,4,1,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Find Value: ");
		int findvalue = scan.nextInt();
		int findindex = -1;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==findvalue) {
				findindex = i;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Value "+arr[findindex]+" is  found at "+findindex);
		} else {
			System.out.println("Value not found.");
		}
		scan.close();
	}
}