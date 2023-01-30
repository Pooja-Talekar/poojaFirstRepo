package controlStatement;

public class NestedBank 
{

	public static void main(String[] args) 
	{
		String PIN="Good";
		Float Amount=2600.45f;
		
		if(PIN=="Good")
		{
			System.out.println("Correct PIN ..Please Proceed");
			
			if(Amount<2500)
			{
				System.out.println("You can Withdraw Money.");
				System.out.println("Thank you for Banking with us");
			}
			else
			{
				System.out.println("You can't withraw money");
				System.out.println("Your Balance is low");
			}
		}
		else
		{
			System.out.println("Pleae enter correct PIN");
			System.out.println("Thank you :) ");
		}
		
	}
		
}


