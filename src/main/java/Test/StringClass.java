package Test;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Akshay";
		
		String fullname = name + " Anand";
		
		
		// Here there will be only 1 object creation in string constant pool which will have same address for both s1 and s2.
		
		// This is used for garbage collection.
		
		String s1 = "akshay";
		String s2 = "akshay";
		
		// By default string is immutable i.e we can not make any change to string once declared
		
		// It is possible with the help of string builder/buffer class to assign different values to string.
		
		
		System.out.println("Full name is "   + fullname  + " " + s2  +  " " + s1);
		
		
		// This is a conversion of charachter array to a string.
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch); 
		System.out.println(s);

	}

}
