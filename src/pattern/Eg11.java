package pattern;

public class Eg11 
{

	public static void main(String[] args)
	{
		// *****
		// ****	
		// ***	 
		// **
		// *
		// **
		// ***
		// ****
		// *****
		
		//Row=9;col=5;Star=5
		
		int star=5;
		
		for(int row=1;row<=9;row++)
		{
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			if(row<5)
			{
				star--;
			}
			else
			{
				star++;
			}
			System.out.println();
		}

	}

}
