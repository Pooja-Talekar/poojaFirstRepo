package pattern;

public class Eg13
{

	public static void main(String[] args) 
	{
		//		*
		//     **
		//	  ***
		//	 ****
		//	*****
		// 	 ****
		//	  ***
		//	   **
		//		*
		
		// Row=9;col=5;space=4;star=1
		int star=1;
		int space=4;
		for(int row=1;row<=9;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			if(row<5)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			System.out.println();
			
		}

	}

}
