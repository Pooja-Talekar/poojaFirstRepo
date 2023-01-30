package InterfaceStudy;

public class ImpStudy extends Test5 implements Test4
{

	public static void main(String[] args) 
	{
		ImpStudy i=new ImpStudy();
		
		i.demo1();
		i.demo2();
		i.demo3();
		i.demo4();
		i.demo6();
		//Test4.demo7();
		demo5();
		i.addition();
	}

//	@Override
//	public void demo3()
//	{
//		System.out.println("Demo3 method from Test4 impleming in ImpStudy");
//		
//	}
//
//	@Override
//	public void demo4() 
//	{
//		System.out.println("Demo4 method from Test4 impleming in ImpStudy");
//		
//	}
//
//	@Override
//	public void demo1() 
//	{
//		System.out.println("Demo1 method from Test3 impleming in ImpStudy");
//		
//	}
//
//	@Override
//	public void demo2()
//	{
//		System.out.println("Demo2 method from Test3 impleming in ImpStudy");
//		
//	}
	
	public static void demo5()
	{
		System.out.println("Demo5 method of own class");
	}

	public void addition()
	{
		int a=15;
		int b=25;
		int sum=super.a+b;
		System.out.println(sum);
	}
	@Override
	public void demo6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo4() {
		// TODO Auto-generated method stub
		
	}
}
