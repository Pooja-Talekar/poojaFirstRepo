package exceptionStudy;

public class TryCatchFinally 
{

	public static void main(String[] args) 
	{
		String a="abc";
		try 
		{
			System.out.println(a.charAt(12));
		}
		catch(NullPointerException e)
		{	
			System.out.println("a value should not be null");		
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Please select the index range between 0 to 2");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");			
		}
		finally
		{
			System.out.println("Bye...");
		}
	}

}
