package exceptionStudy;

public class FinallyBlock 
{

	public static void main(String[] args)
	{
		String a="abc";
		
		try
		{
			System.out.println(a.charAt(9));
		}
		finally
		{
			System.out.println("Hi I am finally Block");
		}

	}

}
