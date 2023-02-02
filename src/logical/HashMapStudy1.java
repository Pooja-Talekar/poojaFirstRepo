package logical;

import java.util.HashMap;
import java.util.Set;

public class HashMapStudy1 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> studInfo=new HashMap<Integer,String>();
		
		studInfo.put(1, "Virendra");
		studInfo.put(2, "Sachin");
		studInfo.put(3, "Kohli");
		studInfo.put(4, "VVS");
		studInfo.put(5, "Rahul");
		
		System.out.println(studInfo);
		
		System.out.println(studInfo.get(3));
		
		System.out.println(studInfo.get(6));
		
		System.out.println("===========================");
		
		Set<Integer> stdin = studInfo.keySet();
		
		for( Integer a:stdin)
		{
			//System.out.println(a);It will print only roll numbers 
			System.out.println(a+":"+studInfo.get(a));
		}

	}

}
