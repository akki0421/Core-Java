package Test;


	
	 class Calc
	
	{
		public int add (int n1, int n2)
		
		{
			return n1+n2;
			
		}
		
	}
	
	// Here same method add exist in both class with same parameter however in method overriding the pref will be given to own class method.
	 class AdCalc extends Calc
	
	{
		public int add (int n1, int n2)
		
		{
			return n1+n2+1;
			
		}
		
		
	}
	
	
	public class MethodOverriding  {
		
		

	public static void main(String[] args) {
		
		AdCalc obj = new AdCalc();
	int result =	obj.add(3, 4);
	
	System.out.println(result);
		
		
	}

}
