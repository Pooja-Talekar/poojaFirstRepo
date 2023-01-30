package stringStudy;

public class StringMethodUse 
{

	public static void main(String[] args)
	{
		//length Method
		System.out.println("Length Method :");
		
		String a="Velocity";
		
		System.out.println(a.length());
		
		String a1=" Pune       ";
		
		System.out.println(a1.length());
		
		String a2="";
		
		int lenghtOfA2 = a2.length();
		
		System.out.println(a2.length());

		System.out.println(lenghtOfA2);
		
		System.out.println("=================================");

		
		//toUppercase Method
		
		System.out.println("Uppercase Method :");
		
		String b="pooja";
		
		System.out.println(b.toUpperCase());
		
		String b2="shree swami samarth";
		
		System.out.println(b2.toUpperCase());
		
		String b1 = b.toUpperCase();
		
		System.out.println("Upper case of "+b+" is : "+b1);
		
		System.out.println("=================================");
		
		//toLowerCase Method
		System.out.println("Lowercase Method :");
		
		String c="SHREE SWAMI SAMARTH";
		
		System.out.println(c.toLowerCase());
		
		String c2= "POOJA";
		
		String c1= c2.toLowerCase();
		
		System.out.println("Lower case of "+c2+" is : "+c1);
		
		System.out.println("=================================");
		
		//IsEmpty Method
		
		String j1= "Pooja";
		System.out.println(j1.isEmpty());
		
		String j2=" ";
		System.out.println(j2.isEmpty());
		
		System.out.println("=================================");
		//IsBlank Method 
		
		String n1=" ";
		System.out.println(n1.isBlank());
		
		String n2="12gdhfh";
		System.out.println(n2.isBlank());
		System.out.println("=================================");
		//charAt Method
		
		String k1="Velocity";
		
		System.out.println(k1.charAt(5));
		
		char k2=k1.charAt(3+1);
		System.out.println("Character at index 4 is :"+k2);
		//System.out.println(k1.charAt(14));Out of Index exception 
		
		System.out.println("=================================");
		
		//equals Method 
		System.out.println("Equals Method");
		String l1="Pooja";
		String lm5="Pooja";// Duplicates are not allowed in constant pool area
		String l3="pooja";// Case sensitive
		String l2=new String("Pooja");
		String l4=new String("Pooja");
		
		System.out.println(l2==lm5);
		System.out.println(l1.equals(lm5));
		System.out.println(l1.equals(l2));//It check for content
		System.out.println(l1.equals(l3));
		System.out.println(l2==l4);//It checks for memory location 
		System.out.println(l1==l4);
		System.out.println("=================================");
		
		//equalsignorecase Method
		
		String v1="Pooja";
		String v3="pooja";
		
		System.out.println(v1.equalsIgnoreCase(v3));//It check for content
		//System.out.println(l1.equals(l3));//Case Insensitive

		//Contains
		System.out.println("=================================");
		String f1 = "Velocity";
		
		System.out.println(f1.contains("oci"));//Checks for specified sequence of characters
		System.out.println(f1.contains("poo"));
		
		System.out.println("=================================");
		
		//endWith
		String b5 ="Vaibhavi";
		
		System.out.println(b5.endsWith("avi"));
		
		boolean b6=b5.endsWith("ooja");
		
		System.out.println(b6);
		System.out.println("=================================");
		
		//Startswith
		String a5=new String("Sachin");
		System.out.println(a5.startsWith("sac"));//Case sensitive
		System.out.println(a5.startsWith("Sac", 0));//True
		//If the given string starts with the specified sequence of character from the given index
		System.out.println(a5.startsWith("Sac", 4));//False
		System.out.println("=================================");
		
		//Substring
		
		String f5="geeta";
		
		System.out.println(f5.substring(3));
		System.out.println(f5.substring(2));
		
		String f6=f5.substring(4);
		System.out.println(f6);
		
		System.out.println("=================================");
		
		//Substring 2
		String h1 = "Ashalata";
		
		System.out.println(h1.substring(3, 6));
		
		//Subsequence
		System.out.println(h1.subSequence(3,6));
		
		System.out.println("=================================");
		
		//concat method 
		
		String l5="Velocity";
		String l6="Pune";
		
		System.out.println(l5.concat(" ").concat(l6));
		
		String l7=l5.concat(" ").concat("Katraj").concat(" ").concat(l6);
		
		System.out.println(l7);
		
		System.out.println("=================================");
		
		//indexof Method
		
		String m5="Bharat";
		System.out.println(m5.indexOf('a'));//Returns the index within this string of the first occurrence of specified character 
		
		System.out.println(m5.lastIndexOf('a'));//Returns the index within this string of the last occurrence of specified character
		
		
		String m6="Mahabharat";
		
		System.out.println(m6.indexOf('a',2));//returns the index within the string of the first occurrence after specified character
		
		System.out.println("=================================");
		
		// replace method
		
		String z1="eye";
		
		System.out.println(z1.replace('e',' '));
		
		String z2="Mahabharat";
		
		System.out.println(z2.replace("ha","xy"));
		
		
		
		
	}

}
