package pattern;

public class Eg12 
{

	public static void main(String[] args) 
	{
		//      *
		//		**
		//		***
		//		****
		//		*****
		//		****
		//		***
		//		**
		//		*

		//row=9;col=5;star=1
		//Outer for loop ->rows
		int star=1;
		
		for(int row=1;row<=9;row++)
		{
			//Inner for loop for star
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			if(row<5)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
			
			
		}
	}

}
