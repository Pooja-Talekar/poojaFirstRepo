package logical;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		//int a=1234;
		//number-->String
		//String-->Number
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter any number :");
		
		int orgNum = sc.nextInt();
		//int orgNum=1234;
		
		String orgStr = Integer.toString(orgNum);
		String revStr="";
		
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char t = orgStr.charAt(i);
			revStr=revStr+t;
		}
		int revNum=Integer.parseInt(revStr);
		
		System.out.println("Original Number :"+orgStr);
		System.out.println("Reverse Number :"+revNum);
		
	}

}
