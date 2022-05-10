package javaAssignments;
//Java Program to Concatenate Two Arrays
public class Q06ConcateArray {
	public static void main(String[] args) {
		int arr1[] = {1,2,4,1,3};
		int arr2[] = {2,3,4,1,5};
		int[] concatArray = new int[(arr1.length + arr2.length)];
		for (int i = 0; i < concatArray.length; i++) {
			if(i > arr1.length-1) {
				concatArray[i] = arr2[i%arr2.length];
			} else {
				concatArray[i] = arr1[i%arr1.length];
			}
		}
		System.out.println("Concate Array: ");
		for (int i = 0; i < concatArray.length; i++) {
			System.out.print(concatArray[i]+" ");
		}
	}
}
