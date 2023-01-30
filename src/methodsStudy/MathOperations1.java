package methodsStudy;

public class MathOperations1 
{
	public void addition()
	{
		int a=30;
		int b=40;
		
		int sum=a+b;
		
		System.out.println("*****Non static method from different class*****");
		System.out.println("Addition is : "+sum);
		//System.out.println("***************************************");
	}
	
	public static void substraction()
	{
		int a=500;
		float b=420.20f;
		
		float sub = a-b;
		
		
		System.out.println("*****static method from different class*****");
		System.out.println("Substraction is : "+sub);
		//System.out.println("***************************************");
	}
}
