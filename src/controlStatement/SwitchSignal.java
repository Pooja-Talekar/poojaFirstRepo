package controlStatement;

public class SwitchSignal 
{

	public static void main(String[] args)
	{
		//1:RED Signal
		//2:YELLOW Signal
		//3:GREEN Signal
		
		String signal ="Red";
		
		switch(signal)
		{
		case "Red" :System.out.println("Please Stop");
		break;
		
		case "Yellow":System.out.println("Please Wait");
		break;
		
		case "Green":System.out.println("Please GO");
		break;
		
		default : System.out.println("Please enter correct signal :)");
		break;
		}

	}

}
