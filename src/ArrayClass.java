import java.util.Arrays;
import java.util.Iterator;

public class ArrayClass {
	public static void main(String[] args) {
		
		//Array Declaration 
		//1-D arrays.
		int[] i;
		//Instantiating array
		i = new int[5]; //array with size = 5
		//Array Literal Declaration
		int[] arrl = {1,2,3,4,5,6,7,8,9,0};
		int[] arrnl = new int[] {1,4,5,3,2};
		//Accessing array using for loop.
		System.out.println("Accessing array using for loop:");
		for (int j = 0; j < arrl.length; j++) {
			System.out.println("arrl["+j+"] = "+arrl[j]);
		}
		//Accessing array using for-each loop
		System.out.println("Accessing array using for-each loop:");
		for (int j : arrl) {
			System.out.println("arrl[] = "+j);			
		}
		//Cloning array obj.
		int cloneArr[] = arrl.clone();
		//Sorting array method sort().
		//before sorting
		System.out.println("print arrnl unsorted array before sorting:");
		for (int j : arrnl) {
			System.out.println("arrnl[] = "+j);
		}
		Arrays.sort(arrnl); //Arrays is class which has methods to perform operation on Array.
		System.out.println("print arrnl unsorted array after sorting:");
		for (int j : arrnl) {
			System.out.println("arrnl[] = "+j);
		}
		
		//2-D Arrays.
		//Array Literal Declaration
		char[][] ch = new char[][]{{'q','r','t','y'},{'p','w','d','a'},{'b','s','f','v'}};
		//Accessing array using nested for loop 2-D array.
		for (int j = 0; j < ch.length; j++) {
			for (int j2 = 0; j2 < ch[j].length; j2++) {
				System.out.print("ch["+j+"]["+j2+"]="+ch[j][j2]+" ");
			}
			System.out.println();
		}
	}
}
