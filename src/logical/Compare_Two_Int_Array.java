package logical;

import java.util.Arrays;

public class Compare_Two_Int_Array 
{

	public static void main(String[] args)
	{
		int ar1[]= {10,20,39};
		int ar2[]= {10,29,30};
		int ar3[]= {10,20,39};
		
		System.out.println(Arrays.equals(ar1, ar2));
		
		System.out.println(Arrays.equals(ar2, ar3));
		
		System.out.println(Arrays.equals(ar1, ar3));
	}

}
