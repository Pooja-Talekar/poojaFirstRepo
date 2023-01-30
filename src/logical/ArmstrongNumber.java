package logical;

import java.util.Scanner;

public class ArmstrongNumber
{

	public static void main(String[] args) 
	{
		//153=1^3+5^3+3^3=1+125+27=

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter any number");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=a;i>0;i=i/10)
		{
			int t=i%10;
			sum = sum+(t*t*t);
		}
		System.out.println("Sum is : "+sum);
		if(a==sum)
		{
			System.out.println(+a+" is armstrong number");
		}
		else
		{
			System.out.println(+a+" is not armstrong number");
		}
		
		
	}

}
