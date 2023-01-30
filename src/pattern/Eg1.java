package pattern;

public class Eg1
{

	public static void main(String[] args) 
	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.print("* ");
//		}
		
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
		//Row , Columns
		//Outer for loop --> rows
		//Inner for loop --> Columns
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
	}

}
