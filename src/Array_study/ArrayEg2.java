package Array_study;

import java.util.Arrays;

public class ArrayEg2 
{

	public static void main(String[] args) 
	{
		int rollno[]= {19,11,29,36,27,23,65,4,56};
		
		System.out.println(rollno[2]);

		System.out.println("==========Using Static Loop==========");
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("=======Using Dynamic Loop===========");
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("=============Sort array ascending order==========");
		Arrays.sort(rollno);
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("=========Sort array decscending order===========");
		for(int i=rollno.length-1;i>=0;i--)
		{
			System.out.print(rollno[i]+" ");
		}
		System.out.println("===============================");
		
		String[] c = {"velocity","is","in","katraj"};
		
		System.out.println(Arrays.toString(c));
		
		System.out.println("===============================");
		
		String[] h=Arrays.copyOf(c, 2);
		
		System.out.println(Arrays.toString(h));
	}

}
