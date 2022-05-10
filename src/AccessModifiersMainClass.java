
public class AccessModifiersMainClass extends AccessModifiers {
	void accessFunc() {
		System.out.println("public- "+var1);
		//System.out.println("private- "+var2); //Error var2 is not visible
		System.out.println("protected- "+var3); //Access bcoz i have inherited the class.
		System.out.println("default- "+var4); //Access bcoz the class files are in the same package.
	}
	public static void main(String[] args) {
		new AccessModifiersMainClass().accessFunc();
	}
}
