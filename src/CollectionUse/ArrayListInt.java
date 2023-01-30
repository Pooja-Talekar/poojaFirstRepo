package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListInt {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<>();
		
		al1.add(1002);
		al1.add(10);
		al1.add(1102);
		al1.add(10);
		al1.add(62);
		al1.add(412);
		al1.add(312);
		al1.add(412);
		al1.add(1512);
		al1.add(112);
		al1.add(1132);
		al1.add(13);
		al1.add(2);
		
		System.out.println(al1);
		
		System.out.println("=========Traversing by for loop=====================");
		
		for(int i=0;i<=al1.size()-1;i++)
		{
			System.out.println(al1.get(i));
		}
		
		System.out.println("============Traversing by using Iterator===================================");
		
		Iterator<Integer> it = al1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("============Traversing by using for each loop====================");
		
		for(Integer a:al1)
		{
			System.out.println(a);
		}
		System.out.println("=============Traversing by using List Iterator==========================");
		
		ListIterator<Integer> lit = al1.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
	}

}
