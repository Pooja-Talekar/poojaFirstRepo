package logical;

import java.util.Scanner;

public class ReverseNoWithoutUsingConversion
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter any number");
		
		int a=sc.nextInt();
		int revNum=0;
		for(int i=a;i>0;i=i/10)
		{
			int t=i%10;
			revNum=(revNum*10)+t;		
		}
		
		System.out.println("Original number is : "+a);
		System.out.println("Reverse Number is :"+revNum);

	}

}
