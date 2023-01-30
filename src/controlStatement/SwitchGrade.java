package controlStatement;

public class SwitchGrade 
{

	public static void main(String[] args) 
	{
		//A: Distinction
		//B: First Class
		//C: Second Class
		//D: Fail
		
		char grade='B';
		
		switch(grade)
		{
		case 'A': System.out.println("Congratulations you passed with Distinction :) ");
		break;
		
		case 'B': System.out.println("Congratulations you passed with First Class :) ");
		break;
		
		case 'C': System.out.println("Congratulations you passed with Second Class :) ");
		break;
		
		case 'D': System.out.println("You are Fail :( ");
		break;
		
		default : System.out.println("Please enter correct grade");
		break;
		}

	}

}
