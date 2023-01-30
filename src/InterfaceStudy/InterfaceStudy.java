package InterfaceStudy;

public class InterfaceStudy implements D
{

	public static void main(String[] args)
	{
		InterfaceStudy is = new InterfaceStudy();
		
		is.test1();
		is.test2();
		is.test3();
		is.test4();
		is.demo1();
		
		C.demo2();
		D.demo2();

	}

	@Override
	public void test1() {
		System.out.println("Test1");
		
	}

	@Override
	public void test2() {
		System.out.println("Test2");
		
	}

	@Override
	public void test3() {
		System.out.println("Test3");
		
	}

	@Override
	public void test4() {
		System.out.println("Test4");
		
	}
	
	@Override	
	public void demo1()
	{
		//C.super.demo1();
		D.super.demo1();
	}
	
	

}
