package exampleEncapsulation;

public class SingletonClass {
	//Singleton Class is a class where we create only one object and restrict object creation.
	private int mem1;
	private String mem2;
	private static SingletonClass obj=null;
	public int getMem1() {
		return mem1;
	}
	public void setMem1(int mem1) {
		this.mem1 = mem1;
	}
	public String getMem2() {
		return mem2;
	}
	public void setMem2(String mem2) {
		this.mem2 = mem2;
	}
	
	private SingletonClass()
	{System.out.println("Default");}
	private SingletonClass(int mem1,String mem2)
	{
		this.mem1 = mem1;
		this.mem2 = mem2;
	}
	
	public static SingletonClass getObject(int mem1,String mem2) {
		if(obj==null)
		{obj = new SingletonClass(mem1, mem2);}
		else
		{obj.mem1=mem1;obj.mem2=mem2;}
		return obj;
	}
}
