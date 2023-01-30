package pattern;

public class Eg8 
{

	public static void main(String[] args)
	{
		//	  *
		//	 ***
		//	*****
		// *******
		
		//row=4 columns =7 space=3 star=1 
				int space=3;
				int star=1;
				
				
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
					space--;
					star=star+2;
				}
	}

}
