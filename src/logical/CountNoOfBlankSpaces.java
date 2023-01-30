package logical;

public class CountNoOfBlankSpaces 
{

	public static void main(String[] args)
	{
		String s="P    u Ne";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char t=s.charAt(i);
			if(t==' ')
			{
				count++;
			}
			
		}
		System.out.println("Total number of blank spaces are :"+count);

	}

}
