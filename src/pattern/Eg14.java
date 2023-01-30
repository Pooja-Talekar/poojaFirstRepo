package pattern;

public class Eg14 
{
	public static void main(String[] args)
	{
		// *         *
		// **       **
		// ***     ***
		// ****   ****
		// ***** *****
		// ****	  ****
		// ***	   ***	
		// **		**
		// *     	 *
		
		//row=9;space1=5;star1=1;space2=4;star2=1
		int star1=1;
		int star2=1;
		int space1=5;
		int space2=4;
		
		for(int row=1;row<=9;row++)
		{
			for(int i=1;i<=star1;i++)
			{
				System.out.print("*");		
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=space2;m++)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=star2;n++)
			{
				System.out.print("*");
			}
			if(row<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			System.out.println();
		}
	}

}
