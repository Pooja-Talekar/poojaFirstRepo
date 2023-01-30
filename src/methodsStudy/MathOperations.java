package methodsStudy;

public class MathOperations 
{

	public static void main(String[] args)
	{
		MathOperations mu = new MathOperations();
		mu.multiplication();//Calling non static method from same class
		
		Division();//Calling static method from same class
		addition(5,4);//Calling static method with parameters
		
		MathOperations1 mu1 = new MathOperations1();
		mu1.addition();//Calling non static method from different class
		
		MathOperations1.substraction();//Calling static method from different class
		

	}
	
	private static void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println("*****static method with parameters*****");
		System.out.println("Static method with parameter : "+sum);
		//System.out.println("***************************************");
	}

	public void multiplication()
	{
		int a=10;
		int b=20;
		
		int Mult=a*b;
		System.out.println("*****non static method from same class*****");
		System.out.println("Multiplication is : "+Mult);
		//System.out.println("*******************************************");
	}
	
	public static void Division()
	{
		int a=500;
		int b=5;
		
		int Div =a/b;
		
		System.out.println("*****static method from same class*****");
		System.out.println("Division is : "+Div);
		//System.out.println("***************************************");
	}

}
