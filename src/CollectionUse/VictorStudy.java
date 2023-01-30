package CollectionUse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VictorStudy 
{

	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<>();
		
		v.add("Velocity");
		v.add(123);
		v.add('A');
		v.add(true);
		v.add(12.20f);
		v.add(null);
		v.add(null);
		v.add("Velocity");
		v.add("Pooja");
		v.add(null);
		v.add("Velocity");
		
		System.out.println(v);
		System.out.println("Capacity is :"+v.capacity());
		System.out.println(v.elementAt(4));
		v.insertElementAt(456,10);
		System.out.println(v.lastIndexOf(null));//Last occurrence of particular duplicate element 
		System.out.println(v.lastIndexOf(null,7));
		
		//v.clear();
		
		System.out.println("=====Traversing by using for loop====");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("=====Traversing by using for each loop====");
		for(Object a:v)
		{
			System.out.println(a);
		}
		System.out.println("=====Traversing by using Iterator====");
		Iterator<Object> it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====Traversing by using List Iterator====");
		ListIterator<Object> lit = v.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("===========enumeration============");
		
		Enumeration<Object> en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
