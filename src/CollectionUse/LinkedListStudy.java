package CollectionUse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy 

{

	public static void main(String[] args)
	{
		LinkedList<Object> ll=new LinkedList<>();
		
		ll.add("Pune");
		ll.add(123);
		ll.add(22.22);
		ll.add(null);
		ll.add(null);
		ll.add(true);
		ll.add("Pune");
		ll.add('A');
		
		System.out.println(ll.peek());
		System.out.println(ll.getClass());
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll.pop());
		System.out.println(ll);
		
		ListIterator<Object> lit = ll.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		Iterator<Object> it = ll.iterator();
		System.out.println("Iterator================");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("============For loop=============");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
	}

}
