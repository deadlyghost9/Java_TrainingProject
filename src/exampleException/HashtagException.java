package exampleException;

//If inherits Exception then its checked Exception and it has to handle before execution on compile time.
public class HashtagException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid Hashtag";
	}
}