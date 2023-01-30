package Array_study;

import java.util.Arrays;

public class Sort_Array_In_Ascending_Order
{

	public static void main(String[] args) 
	{
		int a[]= {238,47,29,8394,76,253,8293,23,123};
		
	    for(int i=0;i<=(a.length-1);i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	
	    	 if(a[i] > a[j])
	    	 {
	    		 int k=a[j];
	    		 a[j]=a[i];
	    		 a[i]=k;
	    	 }
	    		 
	    }
	    System.out.println(Arrays.toString(a));
	}
}
