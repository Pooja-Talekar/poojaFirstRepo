package Casting;

public class upCasting1 
{

	public static void main(String[] args)
	{
		Mother m=new Mother();
		m.Cook();
		m.Look();
		
		System.out.println("===================");
		
		GirlChild g =new GirlChild();
		g.Cook();
		g.Look();
		g.demo1();
		
		System.out.println("====================");
		
		Mother mg=new GirlChild();
		
		mg.Cook();
		mg.Look();
		
//		System.out.println("========================");
//		
//		GirlChild gm =(GirlChild) new Mother();
//		
//		gm.Cook();
//		gm.Look();
//		gm.demo1();
		
	}

}
