package constrctorStudy;

import AccessSpecifierStudy.Private_use;

public class Accses_use  extends Private_use 
{// created class in another package

	public static void main(String[] args) {
		
		Private_use ps= new Private_use();// created object of super class
		ps.sub();// calling public method of another class in other package-- allowed in project
		//ps.add();// calling private method of other class in other package--not allowed in other class
		//ps.mul();//calling default method of other class in other package-- allowed within package
		Private_use.display();//calling protected method of other class within same package-- allowed in same package/ need inheritance to call in another package
		//System.out.println("Value of a is "+ps.a);
		//System.out.println("Value of b is "+ps.b);
		  System.out.println("vlaue of c is "+ps.c);
		  System.out.println("vlaue of d is "+Private_use.d);

	}

}
