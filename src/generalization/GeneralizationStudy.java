package generalization;

public class GeneralizationStudy 
{

	public static void main(String[] args) 
	{
		SBI s=new SBI();
		Axis a=new Axis();
		
		System.out.println("=============================");
		s.deposit();
		s.loan();
		s.withDrawal();
		s.transfer();
		s.yono();
		System.out.println("=============================");
		a.deposit();
		a.transfer();
		a.withDrawal();
		a.loan();
		a.axisMobileBanking();
		System.out.println("=============================");
	}

}
