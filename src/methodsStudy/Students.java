package methodsStudy;

public class Students 
{

	public static void main(String[] args)
	{
		//To call non static methods,we need to create object of a class
		//syntax for object creation --> className objectName = new className();
		
		Students mahesh = new Students();
		
		//How to call non static method 
		//Syntax objectName.methodName();
		
		mahesh.studentInformation();//Calling non static method from same class
		
	}
	
	public void studentInformation()//Non static complete method
	{
		System.out.println("Student information");
		System.out.println("My name is Pooja Talekar");
		System.out.println("My favorite subject is Java");
	}

}
