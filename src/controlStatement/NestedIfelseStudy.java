package controlStatement;

public class NestedIfelseStudy
{

	public static void main(String[] args) 
	{
		String UN ="Velocity";
		String Password ="Velocity@123";
		
		if (UN=="Velocity")
		{
			System.out.println("UN is correct Please enter correct Password");
			
			if(Password =="Velocity@1234")
			{
				System.out.println("Correct Password !!!...Login Success");
			}
			else
			{
				System.out.println("Incorrect Password...Please enter correct Password.");
			}
		}
		else
		{
			System.out.println("Incorrect UN ...Please enter correct UN ");
		}
	}

}
