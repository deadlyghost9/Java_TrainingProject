package exampleEncapsulation;

public class MainClass {
	public static void main(String[] args) {
		BeanClass bc = new BeanClass();
		//bc.mem1=10; //Restricts private members to access in Main class.
		//Setting and reading using getter() and setter() method.
		bc.setMem1(10);
		System.out.println("BeanClass Mem1- "+bc.getMem1());
		bc.setMem2('D');
		System.out.println("BeanClass Mem2- "+bc.getMem2());
		bc.setMem3("Restrict Access");
		System.out.println("BeanClass Mem3- "+bc.getMem3());
		
		//SingletonClass sc = new SingletonClass(); //Restricts private constructor to access in Main class.
		SingletonClass sc = SingletonClass.getObject(40, "New Object Creation");
		System.out.println("1st Object HashCode- "+sc.hashCode());
		SingletonClass sc1 = SingletonClass.getObject(20, "Already Object Creation");
		System.out.println("2nd Object HashCode- "+sc1.hashCode());
		SingletonClass sc2 = SingletonClass.getObject(30, "Again tyring Object Creation");
		System.out.println("3rd Object HashCode- "+sc2.hashCode());
		
	}
}
