package logical;

import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter any number :");
		
		int num=sc.nextInt();
		int count=0;
		//Prime number /2/3/4/5/6/7.......
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}	
			if(count==1)
			{
				System.out.println("Given number is not prime number");
			}
			else
			{
				System.out.println("Given number is prime number");
			}
		
	}	
}
