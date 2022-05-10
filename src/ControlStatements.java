
public class ControlStatements {
	public static void main(String[] args) {
		//Control Statements
		boolean True = true;
		boolean False = false;
		//IF Statement
		if(True)
		{System.out.println("If Statement Condn True");}
		//IF-ELSE Statement
		if(False)
		{System.out.println("If-else Statement Condn True");}
		else
		{System.out.println("If-else Statement Condn False");}
		//IF-ELSE-IF Statement
		if(False)
		{System.out.println("If-else-if Statement Condn 1st ifTrue");}
		else if(True)
		{System.out.println("If-else-if Statement Condn 2nd if True");}
		else
		{System.out.println("If-else-if Statement Condn False");}
		//NESTED IF-ELSE Statement
		if(True)
		{
			if(True)
			{System.out.println("Nested If-else Statement Condn True");}
			else
			{System.out.println("Nested If-else Statement Condn False");}
		}
		else
		{System.out.println("Nested If-else Statement Condn False");}
		//SWITCH Statement
		char choice = 'c';
		switch(choice) {
		case 'a':
			System.out.println("Selected char is a");
			break;
		case 'b':
			System.out.println("Selected char is b");
			break;
		case 'c':
			System.out.println("Selected char is c");
			break;
		default:
			System.out.println("Default Stmt");
		}
		//Switch Expression
		String Result = switch(choice) {
		case 'a','b' -> "Selected a or b";
		case 'c','d' -> "Selected c or d";
		default -> "Default Stmt";
		};
		System.out.println("Result"+Result);
		//For Loop Statement
		for(int i=0;i<10;i++)
		{
			System.out.println("Running For Loop- "+i);
		}
		//For-Each Loop Statement
		String[] arr = {"For","-","Each","Loop","Statement","Array"};
		for (String string : arr) {
			System.out.print(string+" ");
		}
		//While Loop Statement
		while(True)
		{
			System.out.println("\nWhile Loop Statement");
			break; //Terminates the Loop Statement
		}
		//Do-While Loop Statement
		do {
			System.out.println("Do-While Loop Statement");
		}while(False);
	}
}
