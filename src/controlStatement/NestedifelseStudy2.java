package controlStatement;

public class NestedifelseStudy2 
{

	public static void main(String[] args) 
	{
		//Check for login and ATM PIN and amount to withdraw
		
		int Pin=1234;
		float amount =1000;
		
		if (Pin==1234)
		{
			
			System.out.println("Welcome to the Axis Bank");
			
			if (amount<20000)
			{
				System.out.println("You can withraw Money");
			}
			else
			{
				System.out.println("You balance is low");
			}
			
		}
		else
		{
			System.out.println("Please enter correct PIN");
		}

	}

}

