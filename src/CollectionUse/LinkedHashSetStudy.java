package CollectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy 
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Pune");
		lhs.add("Mumbai");
		lhs.add("Thane");
		lhs.add("Nagpur");
		lhs.add("Pune");
		lhs.add(null);
		lhs.add(null);
		lhs.add("Delhi");
		
		System.out.println(lhs);
		
		//lhs.clear();
		
		System.out.println(lhs.size());
		
	//	lhs.clear();
		System.out.println(lhs.clone());
		System.out.println(lhs.contains("Pune"));
		System.out.println(lhs.contains("India"));
		
		Iterator<String> it = lhs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("For Each loop");
		
		for(String l:lhs)
		{
			System.out.println(l);
		}
		
	
	}

}
