package exceptionStudy;

public class ExceptionStudy2 
{

	public static void main(String[] args)
	{
		String a="abc";
		
		try
		{
			System.out.println(a.charAt(2));
			System.out.println("Hello");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Please select index range between 0 to 2");
		}
		System.out.println("Good Evening");
	}

}
