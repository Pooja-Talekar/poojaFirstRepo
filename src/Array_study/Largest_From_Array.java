package Array_study;

public class Largest_From_Array 
{

	public static void main(String[] args) 
	{
		int[] a= {12,34,56,32,567,3453,293};
		
		int maxNumber=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(maxNumber<a[i])
			{
				maxNumber=a[i];
			}
		}
		System.out.println(maxNumber);

	}

}
