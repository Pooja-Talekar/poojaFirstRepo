package abstractClass;

public class ConcreteClass extends Test
{
	public ConcreteClass()
	{
		
	}
	public static void main(String[] args) 
	{
		ConcreteClass cc=new ConcreteClass();
		cc.demo1();
		cc.demo2();
		cc.demo3();
	}

	@Override
	public void demo3() 
	{
		System.out.println("Demo3 is completed in concrete class");
		
	}

}
