package logical;

import java.util.HashMap;

public class HashMapStudy 
{

	public static void main(String[] args) 
	{
		HashMap<String,String> rto=new HashMap<String,String>();
		
		rto.put("MH12","Pune");
		rto.put("MH13","Solapur");
		rto.put("MH14","PCMC");
		rto.put("MH15","Nashik");
		
		System.out.println(rto);
		
		rto.put("MH16","Kolhapur");
		
		System.out.println(rto);
		
		rto.put("MH12","Mumbai");
		
		System.out.println(rto);
		
		System.out.println(rto.get("MH12"));
		
		System.out.println(rto.get("MH14"));
		
		System.out.println(rto.get("MH44"));
	}

}
