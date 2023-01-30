package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<>();
		
		al.add("Velocity");
		al.add(123);
		al.add(null);
		al.add(12.12f);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//al.clear();
	    //System.out.println(al);
		
		Object al1 = al.clone();
		System.out.println("Clone Array"+al1);
		
		System.out.println(al.contains("Velocity"));
		
		System.out.println(al.equals(al1));
		al.add(3, "Pooja");
//		System.out.println("Capacity+++++++++++++++++++++++++++++++++++++");
//		al.ensureCapacity(3);
		System.out.println("==========================");
		//Traversing using for loop
		
		for(int i=0;i<=al.size()-1;i++)
		{	
			System.out.println(al.get(i));
		}
		
		System.out.println("==========================");
		
		//Traversing using Iterator cursor
		
		Iterator<Object> it = al.iterator();
		
		while(it.hasNext())//hasNext return type Boolean
		{
			System.out.println(it.next());			
		}
		System.out.println("==========================");
		//Traversing using List Iterator
		
		ListIterator<Object> li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("=============Using for each loop===================");
		for(Object a:al)
		{
			System.out.println(a);
		}
	}

}
