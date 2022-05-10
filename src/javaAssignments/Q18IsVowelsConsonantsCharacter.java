package javaAssignments;
//Java Program to Count the Number of Vowels and Consonants in a Sentence
public class Q18IsVowelsConsonantsCharacter {
	
	public static boolean isVowel(char ch) {
		return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')? true : false;
	} 
	public static void main(String[] args) {
		String str = "Capgemini";
		char[] charray = str.toCharArray();
		int vowels = 0;
		int cons = 0;
		for (int i = 0; i < charray.length; i++) {
			if(isVowel(charray[i])) {
				vowels++;
			} else	{
				cons++;
			}
		}
		System.out.println("Text: "+str);
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of Consonants: "+cons);
	}
}
