package logical;

import java.util.Scanner;

public class Multiply_Two_No_Without_Multiplication
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter any two numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+b;
		}
		System.out.println("Multiplication of "+a+" and "+b+" is :"+sum);
	}

}
