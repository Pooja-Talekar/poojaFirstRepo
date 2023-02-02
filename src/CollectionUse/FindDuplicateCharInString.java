package CollectionUse;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharInString 
{

	public static void main(String[] args)
	{
		String a="abcdjncbsvcbsvcvsbcvsgcns";
		
		HashMap<Character,Integer> count=new HashMap<Character,Integer>();

		for(int i=0;i<=a.length()-1;i++)
		{
			char t=a.charAt(i);
			if(count.containsKey(t))
			{
				count.put(t,count.get(t)+1);
			}
			else
			{
				count.put(t,1);
			}
				
		}
		
		Set<Character> duplicateCount = count.keySet();
		
		for(Character c:duplicateCount)
		{
			System.out.println(c+": "+ count.get(c));
		}
		System.out.println("================================");
		
		for(Character c:duplicateCount)
		{
			if(count.get(c)>1)
			{
				System.out.println(c+": "+count.get(c));
			}
		}
		
	}

}
