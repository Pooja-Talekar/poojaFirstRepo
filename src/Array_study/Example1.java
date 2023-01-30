package Array_study;

import java.util.Arrays;

public class Example1 
{

	public static void main(String[] args) 
	{
		String ar[]=new String[4];
		
		ar[0]="Velocity";
		ar[1]="Corporate";
		ar[2]="Traning";
		ar[3]="Center";
		
		System.out.println(ar.length);
		//System.out.println(ar[0]);//It will print single value of that index
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("=====================");
		String[] ar1 = ar.clone();
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar1[i]);
		}	
		System.out.println("=====================");
		System.out.println(ar[0].equals(ar1[0]));
		System.out.println("=====================");
		
		
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println("============================");
		Arrays.sort(ar);
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
