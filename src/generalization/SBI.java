package generalization;

public class SBI implements RBI
{

	@Override
	public void deposit() {
		System.out.println("SBI Deposit Method");
		
	}

	@Override
	public void withDrawal() {
		System.out.println("SBI withDrawal Method");
		
	}

	@Override
	public void loan() {
		System.out.println("SBI loan Method");
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI transfer Method");
		
	}
	
	public void yono()
	{
		System.out.println("SBI's own Yono Method");
	}


//	@Override
//	public void deposit()
//	{
//		System.out.println("SBI Deposit Method");
//	}
//
//	@Override
//	public void withDrawal()
//	{
//		System.out.println("SBI WithDrawal Method");		
//	}
//
//	@Override
//	public void loan()	
//	{
//		System.out.println("SBI Loan Method");		
//	}
//
//	@Override
//	public void transfer()
//	{
//		System.out.println("SBI transfer Method");
//	}
//	
//	public void Yono()
//	{
//		System.out.println("SBI Own Yono Method");
//	}

}
