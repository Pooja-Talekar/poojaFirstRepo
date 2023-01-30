package InheritanceStudy;

public class MultilevelInheritance1 
{

	public static void main(String[] args)
	{
		GrandFather1 g1=new GrandFather1();
		g1.farm();
		
		GrandFather1.dairy();
		System.out.println("========================");
		
		Father1 f1=new Father1();
		f1.job();
		f1.farm();
		
		Father1.business();
		Father1.dairy();
		System.out.println("=========================");
		
		Son1 s1=new Son1();
		s1.dancer();
		s1.farm();
		s1.job();
		
		Son1.student();
		Son1.business();
		Son1.dairy();
	}

}
