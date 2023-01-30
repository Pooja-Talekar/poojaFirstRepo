package logical;

import java.util.Scanner;

public class UserInput
{

	public static void main(String[] args) 
	{
		//Scanner is a class of Java which will be available in utility 
		
		Scanner sc=new Scanner(System.in);
		//name
		//char
		//num->decimal/non-decimal
		//boolean
		
		System.out.println("Enter 1st number :");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Addition is :"+c);
		
		
	}

}
