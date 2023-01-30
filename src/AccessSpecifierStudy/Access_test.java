package AccessSpecifierStudy;

public class Access_test {

	public static void main(String[] args)
	{
		
			Private_use p= new Private_use();// creating object of other class
			
			p.sub();// calling public method of other class within same package-- allowed in project
			//p.add();// calling private method of other class within same package--not allowed in other class
			p.mul();//calling default method of other class within same package-- allowed within package
			Private_use.display();//calling protected method of other class within same package-- allowed in same package/ need inheritance to call in another package
			System.out.println("value of a is "+p.a);
			//System.out.println("value of a is "+p.b);
			System.out.println("value of c is "+p.c);
			System.out.println("value of d is "+p.d);


	}

}
