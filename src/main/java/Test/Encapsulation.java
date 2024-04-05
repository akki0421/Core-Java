package Test;


// In encapsulation we can not access the private instance variables of a class outside that class
// To access them we need to create the methods and use getter setter for value assignment.


class Hidden

{
	private int age;
	
	private String name;
	
	
	// This is a constructor which is created like a method with the name same as class name.
	// we can assign values in between the constructor.
	
	// this is a default constructor
	public Hidden()
	
	{
		age=15;
		name ="Akshay";
		
		System.out.println("In Constructor");
		
	}
	
	
	// This is a parametrised constructor.
	//Here we are setting the values of age and name from main method by passing them in objects.
	public Hidden(int age, String name)
	
	{
		this.age =age;
		this.name=name;
		
	}
	
	public int getage()
	
	{
		return age;
		
	}
	
	public void setage(int age)
	
	{
		
		// this keyword used here to differentiate between instance variable and local variable. 
		//it helps to identify which mthod has to be called.
		
		this.age=age;
		
	}
	
	
	public void print()
	
	{
		System.out.println(age + " : " +name);
		
	}
	
	
	
}




public class Encapsulation {

	public static void main(String[] args) {
		
		//We can call constructor just by creating the object of class.
	//By default the hidden class constructor gets created even if we do not define it, but it will be blank if we do not have argument.
		Hidden obj = new Hidden();
		Hidden obj1 = new Hidden(18, "parametrised");
		
	obj.getage();
	   obj.setage(12);
		
		//Here in below example print is a class.
		obj.print();
		obj1.print();
		
		

	}

}
