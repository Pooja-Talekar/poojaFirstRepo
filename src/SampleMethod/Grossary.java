package SampleMethod;

public class Grossary
{

	public static void main(String[] args)
	{
		Grossary g1 = new Grossary();
		
		g1.Details();
		
		Total();

	}
	
	public void Details()
	{
		//Variable declaration and initialization 
		String Shampoo = "Sunsilk";
		String Chocklate = "Dairy Milk";
		Float Sugar = 1.5f;
		Float Rice = 10.50f;
		int Egg = 12;
		
		//Usage of variables
		
		System.out.println("Shampoo  : "+Shampoo);
		System.out.println("Chocklate  : "+Chocklate);
		System.out.println("Sugar  : "+Sugar);
		System.out.println("Rice  : "+Rice);
		System.out.println("Eggs  : "+Egg);
		
	}
	public static void Total()
	{
		//Shampoo = 200,Chocklate =100,Sugar =40.2,Rice =450.10,Eggs=60
		
		int Sh1=200;
		int C1=100;
		float S=40.21f;
		float R=450.12f;
		int E=60;
		//float Add;
		
		float Add = Sh1+C1+S+R+E;
		
		
		System.out.println("*******************************");
		System.out.println("Total is :"+Add);
		
		System.out.println("*******************************");
		
		
	}
}
