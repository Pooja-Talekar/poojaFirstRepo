package InterfaceStudy;

public interface MyInterface 
{
	int a=10;//variables declared inside Interface are by default static and final.
	
	void test1();
	
	void test2();
	
	//static void test3();We can't override static abstract methods hence we can't write static methods in interface.
}
