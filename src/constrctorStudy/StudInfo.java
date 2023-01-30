package constrctorStudy;

public class StudInfo
{
	String name;
	int rollno;
	float age;
	float height;
	char gender;
	
	public StudInfo()
	{
		 name = "Pooja Talekar";
		 rollno = 75989;
		 age = 25.3f;
		 height = 154.5f;
		 gender = 'F';
	}
	
	public StudInfo(String name1,int rollno1,float age1,float height1, char gender1)
	{
		name = name1;
		rollno=rollno1;
		age=age1;
		height=height1;
		gender=gender1;
	}

	public static void main(String[] args) 
	{
		StudInfo S1=new StudInfo();
		S1.studentInfor();
		StudInfo S2=new StudInfo("Sachin Talekar" , 53634,23.3f,154.67f,'M');
		S2.studentInfor();
		

	}
	
	public void studentInfor()
	{
		//System.out.println("========================================");
		System.out.println("Name of Student        : "+name);
		System.out.println("Roll number of Student : "+rollno);
		System.out.println("Age of Student         : "+age);
		System.out.println("Height of Student      : "+height);
		System.out.println("Gender of Student      : "+gender);
		System.out.println("==========================================");
		
		
	}

}
