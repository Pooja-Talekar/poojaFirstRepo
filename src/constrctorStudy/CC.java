package constrctorStudy;

public class CC
{
	public  CC()
	{
		System.out.println("Hi constructor is running");
	}
	
	public static void main(String[] args) 
	{
		CC c1= new CC();
		//CC c2 =new CC();
		 
		c1.test();
		
		

	}
	
	public void test()
	{
		System.out.println("Test method is running");
	}

}
