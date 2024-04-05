package Test;

class Student {
	
		
		String name;
		int rollno;
	
	}



	class ArrayObject 
	
	{
		
		
	
       public static void main(String []args)
		
		{
		            
			Student s1 = new Student();
			
			s1.name="Akshay";
			s1.rollno=21;
			
            Student s2 = new Student();
			
			s2.name="Anand";
			s2.rollno=22;
			
            Student s3 = new Student();
			
			s3.name="Test";
			s3.rollno=23;
			
			
			Student Students []= new Student[3];
			
			Students[0]=s1;
			Students[1]=s2;
			Students[2]=s3;
			
			
			for ( int i=0; i<Students.length;i++)
				
			{
				
				System.out.println(Students[i].name + " "  + Students[i].rollno  + " ");
				
			}
			
			
		}
		
	}
	
		
		
		
	
	
	
	


