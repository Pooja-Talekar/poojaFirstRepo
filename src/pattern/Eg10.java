package pattern;

public class Eg10
{

	public static void main(String[] args)
	{
		//    *
		//   * *
		//  * * *
		// * * * *
		
		//row=4;colomn=4;space=3;star=1;
		int star=1;
		int space=3;
		
		//Outer for loop-rows
		for(int row=1;row<=4;row++)
		{	
			//space
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}

	}

}
