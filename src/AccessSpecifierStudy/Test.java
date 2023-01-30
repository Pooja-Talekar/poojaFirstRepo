package AccessSpecifierStudy;

public class Test 
{
	private int a=10;//Private : visible only within class
	int b =20;//default : visible only within package
	protected int c=30;//Protected : Visible only within package,using inheritance can be used outside of package
	public int d=40;//Public  :visible through out of the project 
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		
		t.Demo1();
		t.Demo2();
		t.Demo3();
		t.Demo4();
		
		System.out.println("Calling private variable 	:"+t.a);
		System.out.println("Calling Default variable 	:"+t.b);
		System.out.println("Calling protected variable 	:"+t.c);
		System.out.println("Calling public variable 	:"+t.d);
	}
	
	private static void Demo1()
	{
		System.out.println("Demo1 private Method");
	}
	
	static void Demo2()
	{
		System.out.println("Demo2 Default Method");
	}
	
	protected static void Demo3()
	{
		System.out.println("Demo3 protected Method");
	}
	
	public static void Demo4()
	{
		System.out.println("Demo4 public Method");
	}

}
