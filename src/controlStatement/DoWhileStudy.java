package controlStatement;

public class DoWhileStudy 
{

	public static void main(String[] args)
	{
		// I want to print hello 5 times
		//1.Initialization
		int a=0;
		
		do
		{
			System.out.println("Hello");
			a++;
		}
		while(a<=4);
		System.out.println("================");
		
		int i=6;
		do
		{
			System.out.println(i);
			i=i+6;
		}
		while(i<=60);
		System.out.println("================");
		
		int b=60;
		do
		{
			System.out.println(b);
			b=b-6;
			
		}
		while(b>=6);
	}

}
