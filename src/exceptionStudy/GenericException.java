package exceptionStudy;

public class GenericException 
{

	public static void main(String[] args)
	{
		String a=null;
		
		try
		{
			System.out.println(a.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Please selct the range of index between 0 to 1");
		}
		catch(NullPointerException e)
		{
			System.out.println("a value should not be null");
			System.out.println(e.fillInStackTrace());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
	}

}
