package AccessSpecifierStudy;

public class Test1
{

	public static void main(String[] args) 
	{
		// To call static methods /global variables from test class-->Need to create object of the class
		
		Test t =new Test();//Created object of another (Test) class
		
		//t.demo1();//Can't call private method from another class
		t.Demo2();//Calling default method from another class in same package
		t.Demo3();//Calling protected method from another class in same package
		t.Demo4();//Calling public method from another class in same package
		
		//System.out.println("Calling private global variable from another class in same package"+t.a);
		System.out.println("Calling Default global variable from another class in same package   "+t.b);
		System.out.println("Calling Protected global variable from another class in same package "+t.c);
		System.out.println("Calling Public global variable from another class in same package    "+t.d);
	}

}
