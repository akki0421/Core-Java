package Practical;

public class StringreverseLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String input = "Hello, World!";  
		        String reversed = "";  
		        // Iterate through each character in the input string starting from the last character  
		        for (int i = input.length() - 1; i >= 0; i--) {  
		            reversed += input.charAt(i);  // Concatenate each character to the reversed string  
		        }   
		        // Print the original and reversed strings  
		        System.out.println("Original String: " + input);  
		        System.out.println("Reversed String: " + reversed);  
		    }  
		 

	}


