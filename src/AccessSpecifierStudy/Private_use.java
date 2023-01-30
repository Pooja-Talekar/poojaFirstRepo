package AccessSpecifierStudy;

public class Private_use 
{

		int a=20;
		private int b=50;
		public int c=60;
		protected static int d=80;
		
		public static void main(String[] args)
		{
			
			Private_use u= new Private_use();
			u.add();//calling private method-- allowed within class
			u.sub();// calling public method-- allowed within project
			u.mul();// calling default method-- allowed within package
			display();//calling protected method--allowed in other packed(use inheritance)
			System.out.println("value of a is "+u.a);
			System.out.println("value of b is "+u.b);
			System.out.println("value of c is "+u.c);
			System.out.println("value of d is "+u.d);
		
		}
		private void add() 
		{       // access specifier private
			
			int a,b=10,c=20;
			a=b+c;
			System.out.println("value of a is "+a);
			
		}
		
		public void sub() 
		{   // access specifier public
			
			int a,b=20,c=10;
			a=b-c;
			System.out.println("value of a is "+a);
		}
		
		void mul() 
		{         //  access specifier default 
			
			int a,b=20,c=10;
			a=b*c;
			System.out.println("value of a is "+a);
		}
		protected static void display()  // access specifier protected
		{
			System.out.println("hi i am protected method");


		}

}
