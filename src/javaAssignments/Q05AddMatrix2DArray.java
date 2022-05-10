package javaAssignments;
//Java Program to Add Two Matrix Using Multi-dimensional Arrays

import java.util.Scanner;

public class Q05AddMatrix2DArray {
	public static void main(String[] args) {
		int[][] mat1 = {{1,1,1},{1,1,1},{1,1,1}};
		int[][] mat2 = {{2,2,2,},{2,2,2},{2,2,2}};
		int[][] mat3;
		Scanner scan = new Scanner(System.in);
		if(mat1.length == mat2.length && mat1[0].length == mat2[0].length) {
			mat3 = new int[mat1.length][mat1[0].length];
			for (int i = 0; i < mat2.length; i++) {
				for (int j = 0; j < mat2.length; j++) {
					mat3[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
			System.out.println("Result Matrix: ");
			for (int i = 0; i < mat3.length; i++) {
				for (int j = 0; j < mat3.length; j++) {
					System.out.print(mat3[i][j]+" ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Matrix lengths doesn't match.");
		}		
		scan.close();
	}
}
