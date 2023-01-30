package InheritanceStudy;

public class MultiLevelInheritance 

{

	public static void main(String[] args)
	{
		GrandFather g=new GrandFather();
		g.exprience();
		
		GrandFather.stories();
		
		System.out.println("===========================");
		Father f=new Father();
		f.home();
		f.exprience();
		
		Father.farm();
		Father.stories();
		
		System.out.println("===========================");
		Child c=new Child();
		c.mobile();
		c.home();
		c.exprience();
		
		Child.laptop();
		Child.farm();
		Child.stories();
	}

}
