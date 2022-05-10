package javaAssignments;
//Get first non-repeating character from String

public class Q29FirstNonRepeatingCharacterFromString {
	public static void main(String[] args) {
		String str =  "i will tell everyone about this topic";
		int[] freq = new int[str.length()];  

		//Convert the given string into character array  
		char str1[] = str.toCharArray();            

		for(int i = 0; i < str.length(); i++) 
		{  
			freq[i] = 1;  
			for(int j = i+1; j <str.length(); j++) 
			{  
				if(str1[i] == str1[j])
				{  
					freq[i]++;  

					//Set str1[j] to 0 to avoid printing visited character  
					str1[j] = '0';  
				}  
			}  
		}
		int index = -1;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]==1)
			{
				index = i;
				break;
			}
		}
		if(index != -1)
		{
			System.out.println("First Non-repeating Character in the given string:");
			System.out.println(str1[index]+"");
		}
		else
		{
			System.out.println("There is not first non repeating character in the given string.");
		}
	}
}
