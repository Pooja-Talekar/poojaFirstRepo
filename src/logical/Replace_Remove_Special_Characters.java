package logical;

import java.util.Scanner;

public class Replace_Remove_Special_Characters 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any String");
		
		String a=sc.next();
		
		String b=a.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(b);

	}

}
