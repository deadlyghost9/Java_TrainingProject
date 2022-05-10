
public class ConstructorChainingInSameClass {
	int value;
	int num;
	//default Constructor
	public ConstructorChainingInSameClass()
	{
		this(29);
		System.out.println("Default Constructor");	
	}
	//parameterized Constructor
	public ConstructorChainingInSameClass(int value)
	{
		this(value,45);
		System.out.println("Parameterized Constructor");
	}
	//Copy Constructor
	public ConstructorChainingInSameClass(int value, int num)
	{
		System.out.println("Copy Constructor");
		this.value = value;
		this.num = num;
	}
}
