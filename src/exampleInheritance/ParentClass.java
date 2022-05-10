package exampleInheritance;

public class ParentClass {
	protected int mem1;
	protected String mem2;
	
	public ParentClass()
	{
		mem1 = 100;
		mem2 = "New Parent";
		System.out.println("Parent Default Constructor");
	}
	public ParentClass(int mem1,String mem2)
	{
		this.mem1=mem1;
		this.mem2=mem2;
		System.out.println("Parent Default Constructor");
	}
	protected void speaks()
	{
		System.out.println("Parent is Speaking");
	}
	protected void silent()
	{
		System.out.println("Parent is silent");
	}
}
