package exampleInheritance;

public class ChildClass extends ParentClass {
	int mem3;
	String mem4;
	public ChildClass() {
		super();
		this.mem3=200;
		this.mem4="New Child";
		System.out.println("Child Constructor");
	}
	public ChildClass(int mem1,String mem2,int mem3,String mem4) {
		super(mem1,mem2);
		this.mem3=mem3;
		this.mem4=mem4;
		System.out.println("Child Constructor");
	}
	@Override
	public void speaks() {
		super.speaks();
		System.out.println("Child is speaking");
	}
	@Override
	public void silent() {
			System.out.println("Child is silent");
	}
	public void play() {
		System.out.println("Child is playing");
	}
}
