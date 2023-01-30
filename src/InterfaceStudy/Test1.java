package InterfaceStudy;

public class Test1 
{

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		a=a+9;
		System.out.println(a);
		
		final int b=20;
		System.out.println(b);
		//b=b+10;//We can't reassign or update the value of final variable 
		//System.out.println(b);
		Test1 t1=new Test1();
		t1.demo();

	}
	
	public final void demo()
	{
		System.out.println("I am demo method from Test1");
	}

}
