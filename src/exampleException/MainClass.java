package exampleException;

import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		//Checking Valid Hashtag.
		String str = "#SADD";
		try {
			Hashtag.checkHashtag(str);
		} catch (HashtagException e1) {
			e1.printStackTrace();
		}
		
		
		//Throwing Unchecked Exception
		try {
			throw new IOException();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
