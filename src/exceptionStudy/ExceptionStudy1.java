package exceptionStudy;

public class ExceptionStudy1 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c=0;
		try
		{
			c=a/b;//risky Code
		}
		catch(ArithmeticException e)
		{
			System.out.println("b value should not be zero");
		}
     	System.out.println(c);
 		System.out.println("Good Evening");
		
		
	}

}
