package pattern;

public class Eg16 
{

	public static void main(String[] args)
	{
		//		   *
		//        * *
		//       * * *
		//      * * * *
		//     * * * * * 
		//      * * * * 
		//       * * * 
		//        * *
		//		   *
		
		//row=9;col=6;space=5;star=1
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
						System.out.print("* ");
					}
					if(row<5)
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
