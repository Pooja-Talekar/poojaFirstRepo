package constrctorStudy;

public class ConstStudy1 
{
	//public ConstStudy1()
	//{
	//	System.out.println("Default constuctor running ");
	//}
	
	public ConstStudy1()
	{
		System.out.println("Hi constructor is running");
	}
	
	public static void main(String[] args) 
	{
		ConstStudy1 CC1 = new ConstStudy1();
		CC1.test();
	}
	public void test()
	{
		System.out.println("Test Method is running");
	}

}
