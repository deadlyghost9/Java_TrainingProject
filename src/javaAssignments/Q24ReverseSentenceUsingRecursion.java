package javaAssignments;

public class Q24ReverseSentenceUsingRecursion {
	public static void main(String[] args) {
		String str = "So goodbye now.";
		String reversedStr = reverseSentence(str);
		System.out.println("Reversed Sentence String: "+reversedStr);
	}
	public static String reverseSentence(String sentence) {
		if (sentence.isEmpty())
			return sentence;

		return reverseSentence(sentence.substring(1)) + sentence.charAt(0);
	}
}
