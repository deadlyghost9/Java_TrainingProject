
public class BasicsOfJava {
	int value=11; //Instance variable/Member Variable
	static int staticvalue=25; //Static variable
	public static void main(String[] args) {
		//Example of Variable/Data Types
		//Data types with default values and Also Local Variable. 
		byte y = 0; //8-bit
		short s = 0; //16-bit
		int i = 0; //32-bit
		long l = 0L; //64-bit
		float f = 0.0f; //32-bit
		double d = 0.00d; //64bit
		char c = '\u0000'; //16-bit   blank/space
		boolean b = false; //1-bit
		
		//Print Types of Variables
		//To access the Instance Variable you need to create Object of class and use '.' operator.
		BasicsOfJava obj = new BasicsOfJava(); //Default Constructor with default values.
		System.out.println("Instance Variable- "+obj.value);
		//Static Variable can be use directly in the static methods in the same class but if its in different class then you can use ClassName/ClassObj + '.' operator to access the variable.
		System.out.println("Static Variable- "+staticvalue);
		//Using ClassName
		System.out.println("ClassName Static Variable- "+BasicsOfJava.staticvalue);
		//Using ClassObj
		System.out.println("ClassObj Static Variable- "+obj.staticvalue);
		//Print all data types and Local Variables 
		System.out.println("Byte- "+y);
		System.out.println("Short- "+s);
		System.out.println("Int- "+i);
		System.out.println("Long- "+l);
		System.out.println("Float- "+f);
		System.out.println("Double- "+d);
		System.out.println("Char- "+c);
		System.out.println("Boolean- "+b);
		
		//Operators
		//Assignment Operator
		int var1 = 12;
		int var2 = 8 ;
		//Unary Operator
		System.out.println("Prefix Increment- "+(++var1));
		var1--; //decrement.
		System.out.println("Postfix Decrement- "+var1);
		//Arithmetic Operator
		System.out.println("Addition- "+(var1+var2));
		System.out.println("Subtraction- "+(var1-var2));
		System.out.println("Multiplication- "+(var1*var2));
		System.out.println("Modulas (Reminder)- "+(var1%var2));
		System.out.println("Division- "+(var1/var2));
		//Relational Operator
		//it will return boolean values
		System.out.println("Equal to- "+(var1==var2));
		System.out.println("Greater than Equal- "+(var1>=var2));
		System.out.println("Less than Equal- "+(var1<=var2));
		System.out.println("Not Equal to- "+(var1 != var2));
		System.out.println("Greater than- "+(var1>var2));
		System.out.println("Less than- "+(var1<var2));
		//Logical Operator
		//Used to check condn's 
		System.out.println("AND- "+(var1>10 && var1<20));
		System.out.println("OR- "+(var2<0 || var2>10));
		//Ternary Operator
		System.out.println("Ternary Operator Large No.- "+(var1 >= var2? var1: var2));
		//Assignment Operator
		System.out.println("Plus Equals- "+(var1+=var2));
		System.out.println("Minus Equals- "+(var1-=var2));
		System.out.println("Multiple Equals- "+(var1*=var2));
		System.out.println("Divide Equals- "+(var1/=var2));
		System.out.println("Modulas Equals- "+(var1%=var2));
		//Bitwise Operator
		System.out.println("OR- "+(var1|var2));
		System.out.println("AND- "+(var1&var2));
		System.out.println("NOT- "+(var1^var2));
		//Shift Operator
		System.out.println("Right Shift- "+(var1>>1));
		System.out.println("Left Shift- "+(var1<<3));
		int neg = -12;
		System.out.println("Negative Right Shift- "+(neg>>>4));
				
	}
}
