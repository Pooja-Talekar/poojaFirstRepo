package methodsStudy;

public class River 
{

	public static void main(String[] args)
	{
		River ganga = new River();
		
		//Need to call non static method from same class
		
		ganga.flow();
		//------------------------------------------
		//How to call non static method from another class
		
		Students vishal=new Students();//Create object of that class whose method to be called  
		
		vishal.studentInformation();//To call method from another class and Calling non static method from another class
		
	}
	
	public void flow()//Non static method from river class
	{
		System.out.println("River is flowing");
	}

}
