package CollectionUse;

import java.util.TreeSet;

public class TreeSetStudy 
{

	public static void main(String[] args)
	{
		TreeSet<Object> t=new TreeSet<>();
		
//		t.add('A');
//		t.add('B');
//		t.add('Z');
//		t.add('X');
//		t.add('C');
		
		t.add(1);
		t.add(10);
		t.add(6);
		t.add(2);
		t.add(9);
		t.add(3);
		t.add(7);
		t.add(5);
		t.add(4);
		t.add(8);
	
		
		System.out.println(t);
		
		System.out.println(t.ceiling(10));
		System.out.println(t.floor(1));
		System.out.println(t.higher(4));
		System.out.println(t.lower(3));
		
		System.out.println(t.pollLast());
		System.out.println(t.pollFirst());
		
		
		
	}

}
