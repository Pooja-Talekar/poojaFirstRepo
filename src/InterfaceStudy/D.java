package InterfaceStudy;

public interface D extends C
{	
	void test3();
	void test4();
	
	default void demo1()
	{
		System.out.println("Default Demo1 method of interface D");
	}
	
	static void demo2()
	{
		System.out.println("Static Demo2 methos from interface D");
	}
}
