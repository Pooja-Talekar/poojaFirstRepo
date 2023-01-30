package variableTypes;

public class Employee
{
	String emp_name;
	String emp_dept;
	int emp_id;
	char emp_gender;
	float emp_salary;
	static String team;
	
	public void emp_info()
	{
		System.out.println("=============================================");
		System.out.println("Emp name is :"+emp_name);
		System.out.println("Emp dept is :"+emp_dept);
		System.out.println("Emp id is :"+emp_id);
		System.out.println("Emp gender is :"+emp_gender);
		System.out.println("Emp salary is :"+emp_salary);
		System.out.println("Emp Team is :"+team);
		//System.out.println("=============================================");
	}

}
