package Test;

	class A
	
	{
		//this is a default constuctor i.e non parametrised
		
		// By default super class extends Objects class in java and it's methods.
		public A()
		
		{
			
			System.out.println("In A");
			
		}
		
		public A(int n)
		
		{
			System.out.println("In int A");
			
		}
		
		
	}
	
	class B extends A
	
	{
             public B()
		
		{
			
			System.out.println("In B");
			
		}
		
	     	public B(int n)
		
		{
	 //super() is there by default that's why creating object of child class is calling the methods/constructor of super class i.e A	
	// by using below argument we can call the super class method with the argument.
	     		
	     	//super(5);
	     		
	     	//By using this i am calling the constructor of same class it means here in int A const. 
	     		//will not be executed both the constuctors of class B will get executed.	
	     		
	     	this();
			System.out.println("In int B");
			
		}
		
		
	}
	
	
	public class SuperThis {

	public static void main(String[] args)
	
	{
		
		// If we create obj like below the result will be In A, In B.
		//B obj = new B();
		
		// If we create obj like below the result will be In int A, In int B. that is a parametrised object.
		
		B obj1 = new B(5);
		System.out.println(obj1);

	}

}
