package Test;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScientificCalculator obj = new ScientificCalculator();
		
		int r1 = obj.add(5, 5);
		int r2 = obj.multi(5, 5);
		
		// this is multi level inheritance 
		int r3 = obj.power(4, 2);
		
		
		System.out.println("Addition is  " + r1 + " Multiplication is " + r2  + " Power is  "  + r3);
				
		

	}

}
