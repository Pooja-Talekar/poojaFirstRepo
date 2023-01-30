package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListBoolean 
{

	public static void main(String[] args)
	{
		ArrayList<Boolean> al =new ArrayList<>();
		
		al.add(true);
		al.add(false);
		
		System.out.println(al);
		
		System.out.println("=========Traversing by for loop=====================");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("============Traversing by using Iterator===================================");
		
		Iterator<Boolean> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=============Traversing by using List Iterator==========================");
		ListIterator<Boolean> lit = al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("==========Traversing by using for each loop================");
		for(Boolean a:al)
		{
			System.out.println(a);
		}

	}

}
