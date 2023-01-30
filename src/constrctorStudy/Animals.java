package constrctorStudy;

public class Animals
{
	String name;
	float age;
	char gender;
	int serialnum;
	
	public Animals()//Zero parameter
	{
		name ="Tiger";
		age=32.3f;
		gender='M';
		serialnum=007;
		
	}
	
	public Animals(String myPet,float old,char gen,int cageNum)
	{
		name=myPet;
		age=old;
		gender=gen;
		serialnum=cageNum;
		
	}
	
	public static void main(String[] args) 
	{
		Animals a1 =new Animals();
		a1.animalinfo();
		
		Animals Zebra= new Animals("Zebra",9.5f,'F',21);
		Zebra.animalinfo();
		
		Animals lion =new Animals("King Lion",29.3f,'M',23);
		lion.animalinfo();

	}

	public void animalinfo() 
	{
		System.out.println("Animal Name is         :"+name);
		System.out.println("Animal age is          :"+age);
		System.out.println("Animal gender is       :"+gender);
		System.out.println("Animal serial number is:"+serialnum);
		System.out.println("*****************************************");
	}
}
