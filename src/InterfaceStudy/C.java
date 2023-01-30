package InterfaceStudy;

public interface C
{
	void test1();
	void test2();
	
	default void demo1()
	{
		System.out.println("Default Demo1 method of interface C");
	}
	
	static void demo2()
	{
		System.out.println("Static Demo2 methos from interface C");
	}
	
}
