package pattern;

public class Eg5 
{

	public static void main(String[] args) 
	{
		//first check Row and Colunm 
		//     *
		//	  **
		//	 ***
		//	****
		// *****
		
		//Check how many space and star are there in 1st line
		int star=1;
		int space=4;
		
		for(int row=1;row<=5;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
	}

}
