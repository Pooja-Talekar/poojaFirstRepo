package ifElseUse;

import java.util.Scanner;

public class LoginFunctinality 
{

	public static void main(String[] args) 
	{
		String user_name="Pooja";
		String password="Mohan@1234";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter username and password");
		String uname = sc.next();
		String pass=sc.next();

		if(user_name.equals(uname))
		{
			if(password.equals(pass))
			{
				System.out.println("Logged in successfully");
			}
			else
			{
				System.out.println("Please check the password");
			}
		}
		else
		{
			System.out.println("Please check the username");
		}
	}

}
