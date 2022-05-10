package exampleInheritance;

public class MainClass {
	public static void main(String[] args) {
		//Base Class reference Derived Class object.
		ParentClass pc = new ChildClass();
		//Base class Object.
		ParentClass pc1 = new ParentClass();
		//Derived Class Child Object
		//Excplicit Type Conversion and Type Casting.
		ChildClass cc = (ChildClass) pc;
		//Derived Class Object.
		//Can't call UnOverride Method.
		pc.speaks();
		pc.silent();
		//Based Class
		pc1.speaks();
		pc1.silent();
		//Derived Class Object.
		cc.speaks();
		cc.silent();
		cc.play();
	}
}
