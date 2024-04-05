package Test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int	x=28;
	
	int y=9;
	
	int a=5;
	
	int b=7;
	
	int c=9;
	
	int result =0;
		
		if(x>10 && y<20 && a<1)
			
		{
		
			System.out.println("Hello");
		
		System.out.println("Hello2");
		
		}
		else
			
			System.out.println("Bye");
		
		if(a>b && a>c)
			System.out.println("Greater than loop");
		
		
		//else if block conditions if need to verify more than 2 conditions on the code
		
		else if (c>b)
			
			System.out.println("else if block");
		
		
		//Turnary operator
		
		result = a%2==0 && a<b ? 10 : 20;
		
		
		System.out.println(result);
			
		
		

			

	}

}
