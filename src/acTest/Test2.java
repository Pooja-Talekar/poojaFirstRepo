package acTest;

import AccessSpecifierStudy.Test;

public class Test2 extends Test
{
	public static void main(String[] args)
	{
		Test t=new Test();
		
		//t.Demo1();//Can't call private method from any class
		//t.Demo2();//Can't call default method from another package
		t.Demo3();//Can't call protected method from another package,without inheritance peration 
		t.Demo4();
		
		Test2 t2=new Test2();
		
		t2.Demo3();//Calling protected method from another package
		t2.Demo4();//Calling public method from another package
	}

}
