package exceptionStudy;

public class MultipleCatchBlocks 
{

	public static void main(String[] args) 
	{
		String a=null;
		
		try
		{
			System.out.println(a.charAt(9));
		}
		catch(NullPointerException e)
		{
			System.out.println("a value should not be null");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Please select the range between 0 to 1");
		}
	}

}
