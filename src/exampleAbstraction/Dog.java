package exampleAbstraction;

public class Dog implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Dog Sounds: baw baw");
	}

	@Override
	public void sleep() {
		System.out.println("Zzzz feeew");
	}

}
