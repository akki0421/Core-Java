package Test;

 class TestMethod {
	
	public void test1()
	
	{
		System.out.println("Test 1 method");		
	}

	public String test2(int cost)
	
	{
		
		if (cost >= 10)
		
		{
		return"Second Method";	
		}
		
		else
		{
			return "Nothing";
		}
	}	

}

public class LearnMethod

{
	
public static void main (String[]args)

{
	
	// Object Creation
	
	TestMethod obj = new TestMethod();
	
	
	//Calling a method
	
	obj.test1();
	
	// Calling a string method with int return type and storing it in string variable to return java
	String str = obj.test2(50);
	
	System.out.println(str);
	
	
	
	
}
	
}