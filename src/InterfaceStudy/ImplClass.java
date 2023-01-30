package InterfaceStudy;

public class ImplClass implements MyInterface
{

	public static void main(String[] args) 
	{
		ImplClass i =new ImplClass();//Created object of Implementation class
		
		i.test1();
		i.test2();
		i.test4();

	}

	@Override
	public void test1()
	{
		System.out.println("Test1 method completed in Impclass");
		
	}

	@Override
	public void test2() 
	{
		
		System.out.println("Test1 method completed in Impclass");
	}
	
	public void test4()
	{
		System.out.println("Test4 method from ImplClass");
	}

}
