package datatypes;

public class DoubleStudy {

	public static void main(String[] args)
	{
		// I want to store weight 
		
		//1.Declare variable
		
		float weight;
		float weight1;
		float weight2;
		
		//2.Assign value 
		
		weight = 70;
		weight1 = 70.30f;//For float value we need to add f at last
		weight2= 99.477484848f; //Float data type shows only 7 numbers
		
		//3.Usage
		
		System.out.println("Mahesh weight is : " +weight);
		System.out.println("Mahesh weight is : " +weight1);
		System.out.println("Mahesh weight is : " +weight2);
		
		// I want to store salary(Double data type example(Double =HIGH ACCURACY)
		
		// 1.Variable declaration 
		
		double salary;
		double salary1;
		
		// 2.assign value 
		
		salary = 1234.4778484648d;
		salary1 = 162677.737884893d;
		
		//Usage 
		
		System.out.println("My Salary is : " +salary);
		System.out.println("Sachin Salary is " +salary1);
	}

}
