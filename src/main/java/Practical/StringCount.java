package Practical;

public class StringCount {
	
	public static void main(String[] args) {
		
		        String[] status = {"ppppf0ffpfpf", "ppfpfpfpf"};
		        
		        // Variable to store the total count of 'f'
		        int totalCount=0;
		        
		        // Iterate over each string in the array
		        for (int i = 0; i < status.length; i++) 
		        
		        {
		            String s = status [i];
		            // Count the occurrences of 'f' in the current string
		            int count = 0;
		            for (int j = 0; j < s.length(); j++) {
		                if (s.charAt(j) == 'f') {
		                    count++;
		                }
		            }
		            // Add the count to the total count
		            totalCount += count;
		        }
		        
		        // Print the total count of 'f'
		        System.out.println("Total count of 'f': " + totalCount);
		                
		    }

}
