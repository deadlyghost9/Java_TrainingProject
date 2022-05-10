package javaAssignments;
//Java Program to Check Leap year
/*
 * 	if yr=1800 
 *  then it should be divided by 400 not 4.
 *  if its divided by 4 the reminder will be 0.
 *  But its not a leap in a mathematical/calendar expression.
 *  */
public class Q14LeapYear {
	public static void isLeapyr(int yr)
	{
		// flag to take a non-leap year by default
		boolean isLeapYr = false;

		// If year is divisible by 4
		if (yr % 4 == 0) {
			isLeapYr = true;
			// To identify whether it
			// is a century year or
			// not
			if (yr % 100 == 0) {
				// Checking if year is divisible by 400
				// therefore century leap year
				if (yr % 400 == 0)
					isLeapYr = true;
				else
					isLeapYr = false;
			}
		}
		// If year is not divisible by 4
		else
			// Flag dealing-  Non leap-year
			isLeapYr = false;
		if (!isLeapYr)
			System.out.println(yr + " : Non Leap-year");
		else
			System.out.println(yr + " : Leap-year");
	}
	public static void main(String[] args) {
		int checkLeapYr = 2000;
		System.out.println("First Check:");
		isLeapyr(checkLeapYr);
		System.out.println("Second Check:");
		checkLeapYr = 1800;
		isLeapyr(checkLeapYr);
		System.out.println("Third Check:");
		checkLeapYr = 2020;
		isLeapyr(checkLeapYr);
	}
}
