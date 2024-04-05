package Practical;

public class StringReverser {
	
	
	public static String Reverser(String inputString, String reversal)
	
	{
		
		// Used string builder class of java to reverse the string. below we are creating the object of string builder
		
	//	StringBuilder reversed = new StringBuilder();
		
		
		//running the loop in reveresed and appending the reversed value one after another this is a second method.
		
		for (int i= inputString.length()-1; i>=0;i--)
			
		{
			
		//	reversed.append(inputString.charAt(i));
			
			
			reversal +=inputString.charAt(i);
			
		}
		
		//Returning the reversed.tostring method which means the computation is returned.
		
	//	return reversed.toString();
		
		return reversal.toString();
		
	}
	
	// Created a main class to call the method.
	
	public static void main(String[]args)
	
	{
		
		// Declared a string which i want to input
		
		String myString ="Akshay";
		
		// Tried with second way of creating object the whole commented out code works.
		
	//	StringReverser rev = new StringReverser();
		
	//	String value = rev.Reverser(myString);
		
		// calling the Reverser method and passing myString as user input and storing it in reversedString.
		
		String  revString = Reverser(myString, "");
		
		System.out.println(revString);
	//	System.out.println(value);
		
		
		
	}
	
	
	

}



//StringBuilder reversed = new StringBuilder 
//
//for (int i=inputString.lenght()-1, i>=0, i--)
//	
//{
//	reversed = append(inputString.charAt(i));
//	
//}
//
//return reversed.tostring();
//
//
//
//psvm
//
//{
//	
//	String str = "Hello World"
//			
//	String result = reversed(str);		
//			
//	psvm("result")
//	
//	
//}






























