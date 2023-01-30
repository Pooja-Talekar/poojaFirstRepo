package pattern;

public class Eg9 {

	public static void main(String[] args) 
	{
		// * * * *
		//	* * *
		//	 * *
		//	  *
		
		//row=4 ; column =4;star=4;space=0
		
		int star=4;
		int space=0;
		
		//row
		for(int row=1;row<=4;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}
	}

}
