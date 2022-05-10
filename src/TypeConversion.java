
public class TypeConversion {
	public static void main(String[] args) {
		//Type Conversion
		//Implicit Conversion (Small to Big)
		byte var1 = 10;
		short var2 = var1;
		int var3 = var2;
		long var4 = var3;
		float var5 = var4;
		double var6 = var5;
		//Char to Int
		int var7 = 'a';
		//Printing all types
		System.out.println("Byte- "+var1);
		System.out.println("Short- "+var2);
		System.out.println("Int- "+var3);
		System.out.println("Long- "+var4);
		System.out.println("Float- "+var5);
		System.out.println("Double- "+var6);
		System.out.println("Char to Int- "+var7);

		//Explicit Conversion (Big to Small) Lose data (Truncate)
		var6=100000.43;
		var5 = (float) var6;
		var4 = (long) var5;
		var3 = (int) var4;
		var2 = (short) var3;
		var1 = (byte) var2;
		//Int to Char
		char var8 = (char) var7;
		
		//Printing all types
		System.out.println("Byte- "+var1);
		System.out.println("Short- "+var2);
		System.out.println("Int- "+var3);
		System.out.println("Long- "+var4);
		System.out.println("Float- "+var5);
		System.out.println("Double- "+var6);
		System.out.println("Int to Char - "+var8);
		
		//Implicit Conversion in Expression
		var1 = 42;
        var2 = 1024;
        var3 = 50000;
        var4 = 3000000;
        var5 = 5.67f;
        var6 = .1234;
        var8 = 'a';
        
        double result1 = (var5 * var1) + (var3 / var8) - (var6 * var2) + var4;
        System.out.println("Implicit Conversion in Expression Result- "+result1);
        
        //Explicit Conversion in Expression
        var1 = (byte) (var2 * var3);
        System.out.println("Explicit Conversion in Expression Byte value- "+var1);
	}
}
