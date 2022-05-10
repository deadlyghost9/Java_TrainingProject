package javaAssignments;
//Move all 0 to end or start of array (int a[] = {1,0,7,8,6,4,0,0})

import java.util.Arrays;

public class Q27Move0toStart {
	public static void main(String[] args) {
		int a[] = {1,0,7,8,6,4,0,0};
		
		Arrays.sort(a);
		
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
