package InterfaceStudy;

public class Son implements Father,Mother//Multiple inheritance can be possible by using interface
{

	public static void main(String[] args) 
	{
		Son s=new Son();
		
		s.love();//Calling Mothers Method
		s.cooking();//Calling Mothers method
		s.money();//Calling fathers method
		s.nature();//Calling fathers method
		s.Bike();//Calling son's method
	}

	@Override
	public void love()
	{
		System.out.println("Love method from Mother interface in Son class");
		
	}

	@Override
	public void cooking() 
	{
		System.out.println("Cooking method from Mother interface in Son class");
		
	}

	@Override
	public void money() 
	{
		System.out.println("Money method from Father interface in Son class");
		
	}

	@Override
	public void nature()
	{
		System.out.println("Nature method from Father interface in Son class");
		
	}
	public void Bike()
	{
		System.out.println("Sons own method Bike ");
	}

}
