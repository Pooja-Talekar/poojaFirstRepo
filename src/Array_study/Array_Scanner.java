package Array_study;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<=size;i++)
		{
			System.out.println("Enter your "+ (i+1) +" : ");
			
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

	}

}
