package exampleEncapsulation;

public class BeanClass {
	//Java bean Class were Memeber variables are private and you access the variable using getter & setter methods.
	private int mem1;
	private char mem2;
	private String mem3;
	public int getMem1() {
		return mem1;
	}
	public void setMem1(int mem1) {
		this.mem1 = mem1;
	}
	public char getMem2() {
		return mem2;
	}
	public void setMem2(char mem2) {
		this.mem2 = mem2;
	}
	public String getMem3() {
		return mem3;
	}
	public void setMem3(String mem3) {
		this.mem3 = mem3;
	}
}
