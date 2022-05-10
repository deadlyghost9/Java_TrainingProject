package exampleException;

import java.util.Scanner;

public class SignUpPage {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Sign Up Page");
		System.out.print("Username: ");
		String username = Sc.next();
		System.out.print("Password: ");
		String password = Sc.next();
		if(password.length()>=8 && password.length()<=16) {
			System.out.print("Confirm Password: ");
			String confirm_password = Sc.next();
			if(password.equals(confirm_password))
				System.out.println("SignUp Completed");
			else {
				try {
					throw new InvalidPasswordException("Passwords are not Matching");
				}
				catch(InvalidPasswordException E)
				{
					System.out.println(E.getMessage());
				}
			}
		}
		else
		{
			try {
				throw new InvalidPasswordException("Recorrect Length of Password");
			}
			catch(InvalidPasswordException E)
			{
				System.out.println(E.getMessage());
			}
		}
	}
}
