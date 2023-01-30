package CollectionUse;

import java.util.ArrayList;

public class ArrayListStudy
{

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<>();
		
		al.add(123);
		al.add("Pooja");
		al.add(23.03f);
		al.add(true);
		al.add('A');
		
		System.out.println("Arraylist is :"+al);
		
		System.out.println("=============================");
		ArrayList<String> al1=new ArrayList<>();
		
		System.out.println(al1.add("Hi"));
		System.out.println("=============================");
		al1.add("Hello");
		al1.add(2,"Bye");//Can't add if previous array index is blank
		
		System.out.println(al1);
		//System.out.println("=============================");
		
		//al1.clear();
		//System.out.println(al1);
		
		System.out.println("=============================");
		
		Object al2 = al1.clone();
		System.out.println(al2);
		System.out.println("=============================");
		System.out.println(al1.contains("Hello"));
		System.out.println(al1.contains("GM"));
		System.out.println("=============================");
		
		al1.get(0);
		System.out.println(al1.get(2));
		System.out.println("=============================");
		int elm=al1.indexOf("Hi");
		System.out.println(elm);
		System.out.println("=============================");
		System.out.println(al1.isEmpty());	
		System.out.println("=============================");
		String rmv = al1.remove(1);
		System.out.println(rmv);
		System.out.println(al1);
		System.out.println("=============================");
		boolean rmv1 = al1.remove("Hi");
		System.out.println(rmv1);
		System.out.println(al1);
		System.out.println("=============================");
		al1.set(0, "GM");
		System.out.println(al1);
		System.out.println("=============================");
		
		
	}

}
