package examplePolymorphism;

public class MainClass {
	public static void main(String[] args) {
		Helper help = new Helper();
		//Helper Multiple Method using int value.
		int resultInt = help.Multiply(20, 30);
		//Helper Multiple Method using double value.
		double resultDouble = help.Multiply(2.32, 1.43);
		
		System.out.println("Integer Multiple Result: "+resultInt);
		System.out.println("Double Multiple Result: "+resultDouble);
	}
}
