package Array_study;

public class Smallest_from_Array 
{

	public static void main(String[] args)
	{
		int a[]= {12,3,45,6,78,34,92,90};
		
		int minNumber=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(minNumber>a[i])
			{
				minNumber=a[i];
			}
		}
		System.out.println(minNumber);
	}

}
