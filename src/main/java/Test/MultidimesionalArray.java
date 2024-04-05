package Test;

public class MultidimesionalArray {
	
	
	public static void main (String []args)
	
	
	{
	
		// Object creation for multidimesional array
		
		int nums [][]= new int[3][3];
		
		
		// Static values allocation to 2D array.
		
//		int nums [][] = { {1, 2, 3, 4},
//	            {5, 6, 7, 8},
//	            {9, 10, 11, 12}
//		};
		
		
		for (int i=0; i<3; i++)
			
		{
			for (int j=0; j<3; j++)
				
			{
			// using math.random function to generate random number.	
			nums [i][j] =(int) (Math.random() * 10);
				
			
			}
			
		}
		
		// Nested for loop for printing
		
		
for (int i=0; i<3; i++)
			
		{
			for (int j=0; j<3; j++)
				
			{
				
				System.out.print(nums [i][j]  + " ");
				
				
				
			}
			
			
//			for (int n[] :nums)
//				
//			{
//				for (int m:n)
//				
//             {
// 	            System.out.print(m + " " );
//	
//                  }
//				
//			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}

	
	
	
	
	
	
	
	
	
	


