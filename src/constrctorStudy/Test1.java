package constrctorStudy;

public class Test1 
{
	int x;
	int y;
	
	public Test1()
	{
		x=8;
		y=10;
		int sum1=x+y;
		System.out.println("Value of X by constructor is :"+x);
		System.out.println("Value of Y by constructor is :"+y);
		System.out.println("Sum in constructor is :"+sum1);
		
	}
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		t1.addition();

	}
	
	public void addition()
	{
		x=10;
		y=11;

		int sum = x+y;
		System.out.println("Now value of X is :"+x);
		System.out.println("Now value of Y is :"+y);
		System.out.println("Sum is :"+sum);
		
	}

}
