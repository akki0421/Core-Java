package Test;

class Outer

{
	public void show ()
	
	{
		
	System.out.println("This is outer class method");
		
	}
	
	
	static class Inner 
	
	{
		
		public void show ()
		
		{
			
			System.out.println("This is inner class method");
			
		}
		
	}
	
}

public class InnerClass {

	public static void main(String[] args) {
		

		Outer o1 = new Outer();
		o1.show();
		Outer.Inner o2 = new Outer.Inner();
		o2.show();

	}

}
