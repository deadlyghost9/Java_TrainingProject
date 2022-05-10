
public class AccessModifiers {
	//Access Modifiers
	//public
	public int var1=10;
	public int getVar1() {
		return var1;
	}
	//private 
	private int var2=20;
	//We use getter and setter method for private instance variable.
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	//protected
	protected int var3=30;
	
	//default
	int var4=40;
	
}
