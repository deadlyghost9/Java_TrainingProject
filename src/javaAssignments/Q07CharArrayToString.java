package javaAssignments;
//Java Program to Convert Character to String and Vice-Versa
public class Q07CharArrayToString {
	public static void main(String[] args) {
		//Char to String
		char c = 'R';
		String ctos1 = ""+c;
		System.out.println("1st Char to String: "+ctos1);
		String ctos2 = Character.toString(c);
		System.out.println("2nd Char to String: "+ctos2);
		String ctos3 = String.valueOf(c);
		System.out.println("3rd Char to String: "+ctos3);
		
		//String to Char
		String s = "Y";
		char stoc1 = s.charAt(0);
		System.out.println("String to Char: "+stoc1);
		
		//Char Array to String
		char[] ch = {'a','r','t','w','q','n'};
		String catos = new String(ch);
		System.out.println("Char Array to String: "+catos);
		
		//String to Char Array
		String st = "Myself";
		char[] stoca = st.toCharArray();
		System.out.println("String to Char Array: ");
		for (int i = 0; i < stoca.length; i++) {
			System.out.print(stoca[i]);
		}
	}
}
