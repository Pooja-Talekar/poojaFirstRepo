package constrctorStudy;

public class CC1
{
	int a; //Variable globally declared 
	int b; //Variable globally declared 
	
	public CC1()
	{
		System.out.println("Hi Constrctior is running ");
		a=150;
		b=2;
	}
	
	public static void main(String[] args)
	{
		CC1 c1=new CC1();
	//	int a=150;
	//	int b=2;
		c1.multiplication();
		
		c1.addition();
		
	}
	public void addition()
	{
		int a=10;
		int b=20;
		int sum =a+b;
		
		System.out.println("Addition is : "+sum);
	}
	public void multiplication()
	{
		int mul=a*b;
		System.out.println("Multiplication is :"+mul);
	}
}
