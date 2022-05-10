package javaAssignments;
//Display Fibonacci Series
import java.util.Scanner;

public class Q02FibonacciSeries {
	public static int fibonacci(int num)
    {
        int x = 0, y = 1, z;
        if (num == 0)
            return x;
        for (int i = 2; i <= num; i++)
        {
            z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range number of Fibonacci Series: ");
		int range = scan.nextInt();
		for(int i=0; i < range;i++)
		{
			System.out.println(fibonacci(i));
		}
		scan.close();
	}
}
