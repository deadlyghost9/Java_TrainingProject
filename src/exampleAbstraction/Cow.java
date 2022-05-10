package exampleAbstraction;

public class Cow implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Cow Sound: MOO MOO");
	}

	@Override
	public void sleep() {
		System.out.println("Zzzz");
	}

}
