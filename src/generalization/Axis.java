package generalization;

public class Axis implements RBI
{

	@Override
	public void deposit() 
	{
		System.out.println("Axis Deposite method ");
	}

	@Override
	public void withDrawal() 
	{
		System.out.println("Axis withDrawal method ");
	}

	@Override
	public void loan()
	{
		System.out.println("Axis's loan method ");
	}

	@Override
	public void transfer() 
	{
		System.out.println("Axis's transfer method ");
	
	}
	public void axisMobileBanking()
	{
		System.out.println("Axis mobile banking own method ");

	}

}
