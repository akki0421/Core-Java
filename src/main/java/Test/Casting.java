package Test;

class Up
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class Down extends Up
{
	public void show2()
	{
		System.out.println("in show B");
	}
}

public class  Casting{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//    	
//    	System.out.println(i);
    	
//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();
    	
    	Up obj=new Down();
    	obj.show1();
    	
    	Down obj1=(Down)obj;
    	obj1.show2();
    }
}
