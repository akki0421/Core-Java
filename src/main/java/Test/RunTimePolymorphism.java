package Test;


class Father
{
	public void show ()
	
	{
		System.out.println("In class A");
		
	}
	
}


class Son extends Father

{
	
public void show ()
	
	{
		System.out.println("In class B");
		
	}
	
	
}

class Daughter extends Father

{
public void show ()
	
	{
		System.out.println("In class C");
		
	}
	
	
}



public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		
		Father obj = new Father();
		obj.show();
		/// The object is created for A however the result is calculated on the basis of refrence we are changing to B and C.
		obj = new Son();
		obj.show();
		
		obj= new Daughter();
		obj.show();
		

	}

}
