
public class ConstructorsMainClass extends Constructors {
	//Constructor Chaining in Different Class
	public ConstructorsMainClass() {
		super();
		System.out.println("Sub class Default Constructor");
	}

	public ConstructorsMainClass(int value) {
		super(value);
		System.out.println("Sub class parameterized constructor");
	}
	
	public static void main(String[] args) {
		//Calling Constructor while creating new objects using new operator.
		Constructors obj1 = new Constructors(); //default Constructor
		Constructors obj2 = new Constructors(45); //Parameterized Constructor
		Constructors obj3 = new Constructors(obj1); //Copy Constructor
		
		//Calling Constructor Chained in Same Class.
		ConstructorChainingInSameClass objc = new ConstructorChainingInSameClass();
		
		//Calling Constructor Chained in Different Class.
		ConstructorsMainClass objsc = new ConstructorsMainClass(25);
		
		
	}
}
