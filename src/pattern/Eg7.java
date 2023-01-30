package pattern;

public class Eg7 
{

	public static void main(String[] args)
	{
		// *******
		//  *****
		//	 ***
		//	  *
		
		//row=4 coloumns =7 space=0 star=7 
		int space=0;
		int star=7;
		
		
		//outer for loop -> row
		for(int row=1;row<=4;row++)
		{
			//Space
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			//Star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}

}
