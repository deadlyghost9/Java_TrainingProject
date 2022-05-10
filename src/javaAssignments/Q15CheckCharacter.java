package javaAssignments;
//Java Program to Check Whether a Character is Alphabet or Not
public class Q15CheckCharacter {
	public static boolean isAlphabet(int ch) {
		if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		char ch = 'E';
		char ch1 = '0';
		if(isAlphabet(ch)){
			System.out.println("Character is Alphabet: "+ch);
		} else {
			System.out.println("Character is not Alphabet: "+ch);
		}
		
		if(isAlphabet(ch1)){
			System.out.println("Character is Alphabet: "+ch1);
		} else {
			System.out.println("Character is not Alphabet: "+ch1);
		}
	}
}
