package CollectionUse;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy 
{

	public static void main(String[] args) 
	{
		HashSet<Object> hs=new HashSet<>();
		
		hs.add("Pune");
		hs.add(123);
		hs.add(22.22);
		hs.add(null);
		hs.add(null);
		hs.add(true);
		hs.add("Pune");
		hs.add('A');
		
		System.out.println(hs);
		
		//We Can't use for loop as there is no get method  in hashset 
		System.out.println("===========Traversing by using for each loop ================");
		for(Object a:hs)
		{
			System.out.println(a);
		}
		System.out.println("===========Traversing by using Iterator ================");
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
