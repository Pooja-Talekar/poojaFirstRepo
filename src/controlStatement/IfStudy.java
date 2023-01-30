package controlStatement;

public class IfStudy 
{

	public static void main(String[] args)
	{
		//If marks are greater than 40 then I am pass
		
		float marks =60.7f;
		
		if (marks >40)
		{
			System.out.println("I am Pass");
		}
		else
		{
			System.out.println("I am fail");
		}
		
		//==========================================//
		//If signal is red then stop
		
		String signal ="Green";
		
		if(signal=="Red")
		{
			System.out.println("Stop your bike");
		}
		else if(signal=="Yellow")
		{
			System.out.println("Wait for some time");
		}
		else
		{
			System.out.println("Go");
		}
		//==================================================//
		
		//If gender is female(F)then can enter in bus
		
		char gender='M';
		
		if (gender=='F')
		{
			System.out.println("You can enter in Bus");
		}
		else
		{
			System.out.println("You can't enter into the Bus");
		}
	}

}
