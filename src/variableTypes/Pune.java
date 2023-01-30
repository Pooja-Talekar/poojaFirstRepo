package variableTypes;

public class Pune
{
	int p=120;//Non static variable
	static int q=130;//Static variable
	
	public static void main(String[] args)
	{
		Pune pu = new Pune();//Created object of class
		pu.demo();//Calling non static method from same class
		demo1();//Calling static method from same class
		
		System.out.println("Value of P is :"+pu.p);//Calling non static variable from same class in main method
		System.out.println("Value of Q is :"+q);//Calling static variable from same class in main method
		
		int div=120/pu.p;//Usage of not static variable from same class
		int mul=100*q;//Usage of static variable from same class
		
		System.out.println("div is :"+div);//
		System.out.println("Multiplication is :"+mul);//
	
	}
	public void demo()
	{
		int p=190;//Local variable
		//Static int x=190;Static variable can not be declared in particular method.
		//Static variable always should be global variable
		Pune p2=new Pune();
		int mul=p2.p*100;
		System.out.println("Multiplication in demo with global variable:"+mul);
		mul =p*100;
		System.out.println("Multiplication in demo with local variable :"+mul);
		
		
	}
	
	public static void demo1()
	{
		int t=10;
		int sum =t+100;
		
		System.out.println("Addition in Demo1 is :"+sum);
		
	}

}
