package methodsStudy;

public class PuneUniversity 
{

	public static void main(String[] args)
	{
		PuneUniversity s1=new PuneUniversity();
		s1.studentInfo();
		result();
		s1.studentinfo("Sachin Talekar","Electrical",30.4f,'M',82399);
		PuneUniversity s2=new PuneUniversity();
		s2.result(40,80,46,88);

	}
	public void studentInfo()
	{
		String name = "Pooja Talekar";
		String dept = "IT";
		float age = 26.3f;
		char gender = 'F';
		int prnNum = 384748;
		
		System.out.println("================================");
		System.out.println("        Pune University         ");
		System.out.println("================================");
		
		System.out.println("Student Name  : "+name);
		System.out.println("Department    : "+dept);
		System.out.println("Age           : "+age+" Years");
		System.out.println("Gender        : "+gender);
		System.out.println("PRN No        : "+prnNum);
		
		System.out.println("================================");
		
		
	}
	
	public void studentinfo(String name,String dept,float age,char gender,int prnNum)
	{
		System.out.println("================================");
		System.out.println("        Pune University         ");
		System.out.println("================================");
		
		System.out.println("Student Name  : "+name);
		System.out.println("Department    : "+dept);
		System.out.println("Age           : "+age+" Years");
		System.out.println("Gender        : "+gender);
		System.out.println("PRN No        : "+prnNum);
		
		System.out.println("================================");
	}
	
	public static void result()
	{
		int sub1=67;
		int sub2=78;
		int sub3=88;
		
		float result=((sub1+sub2+sub3)*100f/300);
		System.out.println("Student Result :"+result);
		System.out.println("================================");
		
	}
	
	public void result(int sub1,int sub2,int sub3,int sub4)
	{
		float result=((sub1+sub2+sub3+sub4)*100f/400);
		System.out.println("Student Result :"+result);
		System.out.println("================================");
		
	}
}
