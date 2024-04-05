package Test;

class Mobile

{
	// If we declare an instance variable as static it will have it own unique value which is shared by all other objects.
	static String MobileName;
	
	int Price;
	
	String Type;
	
public void print()

{
	System.out.println("Mobile name " +MobileName  + " Price " +Price + " Type " +Type );
	
}
	
public static void print1()

{
	// Price and type are non static method hence can not be called in a static method.
	
	//System.out.println("Mobile name " +MobileName  + " Price " +Price + " Type " +Type );
	
}
	
}

public class StaticVariable {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		
	//	Mobile obj2 = new Mobile();
		
		
		// Static variables can be called from there class name like Mobile.MobileName
		
		
		Mobile.MobileName="Apple";
		Mobile.MobileName ="Samsung";
		obj1.Price=1500;
		obj1.Type="smart phone";
		
		obj1.print();
		
		// We can call static method with class name.
		Mobile.print1();
		

	}

}
