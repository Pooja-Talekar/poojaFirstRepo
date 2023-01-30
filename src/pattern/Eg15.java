package pattern;

public class Eg15 
{

	public static void main(String[] args) 
	{
		//		   *
		//        * *
		//       * * *
		//      * * * *
		//     * * * * *
		//    * * * * * *
		//     * * * * * 
		//      * * * * 
		//       * * * 
		//        * *
		//		   *

		//row=11;col=6;space=5;star=1
		int star=1;
		int space=5;
		
		for(int row=1;row<=11;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			if(row<6)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
			System.out.println();
		}
	}

}
