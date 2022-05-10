package exampleException;	

public class Hashtag {
	//Condition to check Hashtag.
	public static void checkHashtag(String stmt) throws HashtagException
	{
		if(stmt.charAt(0)=='#')
		{
			System.out.println("VALID HASHTAG");
		}
		else
		{
			throw new HashtagException();
		}
	}
}
