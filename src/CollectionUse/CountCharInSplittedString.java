package CollectionUse;

import java.util.HashMap;
import java.util.Set;

public class CountCharInSplittedString 
{

	public static void main(String[] args)
	{
		String s="abc abc pqr pqr xyz mno xyz";
		
		HashMap<String,Integer> cnt=new HashMap<String,Integer>();
		
		String[] t = null;
		for(int i=0;i<=s.length()-1;i++)
		{
			t=s.split(" ");
			System.out.println(t[i]);
			
			if(cnt.containsKey(t[0]))
			{
				cnt.put(t[0],cnt.get(t[0])+1);
			}
			else
			{
				cnt.put(t[0],1);
			}
		}
		
		Set<String> duplicateCnt = cnt.keySet();
		
		for( String d:duplicateCnt)
		{
			System.out.println(d+": "+cnt.get(d));
		}
		
	}

}
