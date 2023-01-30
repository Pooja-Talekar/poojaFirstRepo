package thisAndSuperUse;

public class ThisUse 
{	
	int a=90;//Non static global variable
	int b=80;
	
	static int c=100;//Static global variable

	public static void main(String[] args) 
	{
		ThisUse tu = new ThisUse();
		tu.addition();

	}
	public void addition()
	{
		int a=9;//Local value of a;
		int b=1;
		
		int sum =a+b;//Calling local value of a
		System.out.println("Addition is "+sum);
		
		int sum1=this.a+b;//Calling global value of a
		System.out.println("Addition is "+sum1);
		
	}
	public static void sub()
	{
		//static int a =100;//We should not create any static local variable
	}
}
