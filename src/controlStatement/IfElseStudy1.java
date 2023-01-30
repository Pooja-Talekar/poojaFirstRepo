package controlStatement;

public class IfElseStudy1 
{

	public static void main(String[] args)
	{
		//If Voter's age is greater that 18 then only voter can vote 
		
		int voter_age = 15;
		
		if (voter_age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		
		System.out.println("================================");
		
		String signal ="Yellow";
		
		if(signal=="Red")
		{
			System.out.println("Please Stop");
		}
		else if(signal=="Yellow")
		{
			System.out.println("Please wait");
		}
		else 
		{
			System.out.println("You can go");
		}
	}

}
