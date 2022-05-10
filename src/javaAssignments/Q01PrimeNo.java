package javaAssignments;
//Check Whether a Number is Prime or Not
import java.util.Scanner;


public class Q01PrimeNo {
	public static void primeNumber(int number) {
		boolean flag = false;
		if (number == 0 || number == 1) {
			System.out.println("Not Prime Number.");
		} else {
			
			for(int i=2;i>=number/2;i++) {
				if(number%2==0)
				{
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");
			}
		}
	}
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		number = scan.nextInt();
		primeNumber(number);
		scan.close();
	}
}
