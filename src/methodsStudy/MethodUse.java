package methodsStudy;

public class MethodUse 
{

	public static void main(String[] args) 
	{
		//How to call static regular from same class
		//Just call with method name in main method
		addition();//Calling static regular method from same class
		subtraction();
	}
	
	public static void addition()//Static regular complete method
	{
		int a=10;//1.2.Variable declaration and Variable initialization 
		int b=20;//1.2.Variable declaration and Variable initialization
		
		int c=a+b;//3.Variable usage
		
		System.out.println("The addition is :"+c);
		
	}
	
	public static void subtraction()
	{
		System.out.println("Hi how are you ");
		int a=30;
		int b=10;
		int c=a-b;
		System.out.println("The substraction is : "+c);
	}

}
