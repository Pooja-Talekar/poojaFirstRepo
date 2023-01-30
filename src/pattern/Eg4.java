package pattern;

public class Eg4
{

	public static void main(String[] args) 
	{
		// *****
		//	****
		//	 ***
		//	  **	
		//	   *
		
		int count =5;
		int space =0;
		
		for(int i=1;i<=5;i++)
		{
			//Loop for Space
			for(int k=1;k<=space;k++)
				{
					System.out.print(" ");
				}
			
			for(int j=1;j<=count;j++)
			{
				System.out.print("*");
						
			}	
			System.out.println();
			space++;
			count--;
		}
	}

}
