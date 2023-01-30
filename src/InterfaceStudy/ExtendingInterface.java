package InterfaceStudy;

public class ExtendingInterface implements B
{

	public static void main(String[] args) 
	{
		ExtendingInterface ei =new ExtendingInterface();
		
		ei.demo1();
		ei.demo2();
		ei.demo3();
		ei.demo4();
		ei.demo5();

	}

	@Override
	public void demo1()
	{
		System.out.println("Demo1 method from A overided in ExtendingInteface");
		
	}

	@Override
	public void demo2()
	{
		System.out.println("Demo2 method from A overided in ExtendingInteface");
		
	}

	@Override
	public void demo3()
	{
		System.out.println("Demo3 method from B overided in ExtendingInteface");
		
	}

	@Override
	public void demo4()
	{
		System.out.println("Demo4 method from B overided in ExtendingInteface");
		
	}
	public void demo5()
	{
		System.out.println("Own method");
	}
	

}
