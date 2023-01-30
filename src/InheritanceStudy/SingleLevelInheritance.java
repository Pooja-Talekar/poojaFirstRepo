package InheritanceStudy;

public class SingleLevelInheritance 
{

	public static void main(String[] args) 
	{
		Mother m =new Mother();
		m.cook();
		Mother.saree();
		System.out.println("=======================");
		
		Daughter d=new Daughter();
		d.bike();
		Daughter.dress();
		d.cook();
		Daughter.saree();

	}

}
