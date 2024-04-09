package Test;


  // an abstract class can hold abstract as well as non abstract methods.
abstract class Car

{
	// If you dont want to implement the method in the same class then make it as abstract and create a abstract class to hold abstract method.
	//This can be done by placing keyword abstract in prefix of class name and method name.
	//
	abstract public int Mileage();
	
	public String Name ()
	
	{
		return "Hyundai";
		
	}
	
	
}

abstract class Model extends Car

{
	abstract public void Capacity();
	
	
}


class Company extends Model

{
	
	// Here we have defined the method capacity which was from abstract class, this is mandatory.
	
	public void Capacity ()
	
	{
		
		System.out.println("Capacity = 5 pax");
	}

	
	public int Mileage() {
		
		return 15;
	}


	
	
}



public class AbstractKeyword {

	public static void main(String []args)
	
	{
		
		Company c1 = new Company();
		
		c1.Mileage();
		c1.Capacity();
		c1.Name();
		
		System.out.println("Mileage of the car is :" + c1.Mileage() + " Name of the car is  : " + c1.Name());
		
	//	System.out.println("Name of the car : " + c1.Mileage() "Sitting Capacity of the car is  :" + c1.Capacity()  "NAme of the car is  : " + c1.Name());
		
		
	}
	
	
}
