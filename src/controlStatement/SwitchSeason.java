package controlStatement;

public class SwitchSeason 
{

	public static void main(String[] args)
	{
		//1.Winter Season
		//2.Rainy Season
		//3.Summer Season
		
		String season = "Winter";
		
		switch(season)
		{
		case "Winter" :System.out.println("Welcome to the Winter season");
		break;
		
		case "Rainy" :System.out.println("Welcome to the Rainy season");
		break;
		
		case "Summer" : System.out.println("Welcome to the Summer season");
		break;
		
		default : System.out.println("Please enter correct season");
		break;
		}
	}

}
