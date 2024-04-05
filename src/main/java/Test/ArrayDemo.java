package Test;

public class ArrayDemo {
	
	public static void main(String[]args)
	
	{
		
		int a[] = {1,2,3,4};
		
		String str[] = new String[2];
		
		str[0]="Akshay";
		str[1]="Anand";
		
		
		for (int i=0;i<str.length;i++)
			
		{
			System.out.println(str[i]);
			
		}
		
		
	//	for (int j=0; j<=3; j++)
			
			
		// Use Length in place of last index in array to avoid the exception 
		//of out of bound etc. This .length property will execute the loop till the length of the array.
		
		
			for (int j=0;j<a.length;j++)
			
		
		
		System.out.println(a[j]);
 		
		
		
		int b[]= new int[4];
		
		b[0]=4;
		b[1]=5;
		b[2]=6;
		b[3]=99;
		
		// using for loop to print all array at once.
		
		for(int i=0; i<b.length; i++ )
			
		
		
		System.out.println(b[i]);
		
		// Advanced for loop
		for (int n :b)
		{
			System.out.println(n);
		}
		
		
	}

}
