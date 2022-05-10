
public class Constructors {
	//Constructors
	int value;
	//default Constructor
	public Constructors()
	{
		System.out.println("Default Constructor");
		value=1;
	}
	//parameterized Constructor
	public Constructors(int value)
	{
		System.out.println("Parameterized Constructor");
		this.value=value;
	}
	//Copy Constructor
	public Constructors(Constructors obj)
	{
		System.out.println("Copy Constructor");
		this.value = obj.value;
	}
	
}
