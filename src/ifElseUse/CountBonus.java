package ifElseUse;

import java.util.Scanner;

public class CountBonus 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter grade of the employee");
		int grade=sc.nextInt();
		
		System.out.println("Please enter Exprience of the employee");
		int exp=sc.nextInt();
		
		System.out.println("Please enter salary of the employee");
		float salary=sc.nextFloat();

		if(exp>5)
		{
			if(grade>=8 && grade<=10)
			{
				float bonus =(salary *15)/100;
				System.err.println("Congratulations employee received "+bonus+" bonus");
			}
			else
			{
				System.out.println("Sorry grade is not between 8 to 10");
			}
		}
		else
		{
			System.out.println("Sorry Exprience is less that 5 years");
		}
	}

}
