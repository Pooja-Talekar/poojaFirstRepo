package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListFloat
{

	public static void main(String[] args) 
	{
		ArrayList<Float> af=new ArrayList<>();
		
		af.add(23.30f);
		af.add(1.34f);
		af.add(21.78f);
		af.add(57.9f);
		af.add(09.76f);
		
		System.out.println(af);
		
		System.out.println("=========Traversing by for loop=====================");
		
		for(int i=0;i<=af.size()-1;i++)
		{
			System.out.println(af.get(i));
		}
		
		System.out.println("============Traversing by using Iterator===================================");
		
		Iterator<Float> it = af.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==========Traversing by using for each loop================");
		
		for(Float a:af)
		{
			System.out.println(a);
		}
		
		System.out.println("=============Traversing by using List Iterator==========================");
		ListIterator<Float> li = af.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
