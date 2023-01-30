package Casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		Son s1=new Son();
		s1.Bike();
		s1.Car();
		s1.Degree();
		
		System.out.println("=================");
		
		Father f1=new Father();
		f1.Bike();
		f1.Car();
		
		System.out.println("=================");
		
		Father sf=new Son();
		sf.Bike();
		sf.Car();
		
		

	}

}
