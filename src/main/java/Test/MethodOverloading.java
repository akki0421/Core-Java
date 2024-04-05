package Test;


class Overloading

{
	public int add(int n1,int n2)
	
	{
	return n1+n2;
	
	}
	
public int add(int n1,int n2, int n3)
	
	{
	return n1+n2+n3;
	
	}
	
	
public double add(double n1,int n2, int n3)

{
return n1+n2+n3;

}
	
	
}



public class MethodOverloading {
	
	public static void main (String[]args)
	
	{
		Overloading sum = new Overloading();
		
		int addition1 = sum.add(5, 6);
		
		int addition2 = sum.add(3, 2, 1);
		
		double addition3 =  sum.add(3.5, 2, 1);
		
		System.out.println(addition1);
		System.out.println(addition2);
		System.out.println(addition3);
		
	}

}
