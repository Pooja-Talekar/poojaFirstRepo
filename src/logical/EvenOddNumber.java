package logical;

import java.util.Scanner;

public class EvenOddNumber 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter any number :");
		int num = sc.nextInt();
		
		if(num==0)
		{
			System.out.println("Please enter number other than 0");
		}
		else if(num%2==0)
		{
			System.out.println("Given number is even Number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}
	}

}
