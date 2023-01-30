package pattern;

public class Eg2 
{

	public static void main(String[] args)
	{
		// *
		// **
		// ***
		// ****
		// *****
		int count =1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=count;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			count++;
			
		}

	}

}
