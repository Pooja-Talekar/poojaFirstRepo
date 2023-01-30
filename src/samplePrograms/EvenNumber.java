package samplePrograms;

public class EvenNumber 
{

	public static void main(String[] args) 
	{
		int i[]= {1,2,3,4,5,6,7,8,9};
		
		for(int j=0;j<=i.length-1;j++)//for(int j=0;j<=8;j++)
		{
			
			if(i[j]% 2== 0)
			{
				System.out.println("Number is even number : "+i[j]);
			}	
			else
			{
				System.out.println("Number is odd number : "+i[j]);
			}
		}

	}

}
