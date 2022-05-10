package exampleAbstraction;

public class MainClass {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.animalSound();
		dog.sleep();
		
		Animal cow = new Cow();
		cow.animalSound();
		cow.sleep();
	}
}
