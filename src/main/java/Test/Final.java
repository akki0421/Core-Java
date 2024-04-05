package Test;



// if add final in front on class the class can not be inherited

class Cal



{
	
	// if added final in front of variable keyword in front of variable it's value can not be changed.
	final int num1 =10;
	
	// num1 = 20;
	
	int num2 = 20;
	
	//If added final in front of method then the method can not be inherited to child class.
	
	final public int add (int num1, int num2)
	
	{
		return num1+num2;
		
	}
	
    public int sub (int num1, int num2)
	
	{
		return num1-num2;
		
	}
	
	
}

class AdCal extends Cal
{
	
	
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal obj = new Cal();
		
	int result = 	obj.sub(50, 30);
		
	System.out.println(result);
		
		
		

	}

}
