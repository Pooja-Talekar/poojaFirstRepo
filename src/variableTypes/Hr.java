package variableTypes;

public class Hr
{

	public static void main(String[] args) 
	{
		Employee sachin =new Employee();
		
		sachin.emp_name="Sachin Tendulkar";
		sachin.emp_dept="Computer";
		sachin.emp_id=2342;
		sachin.emp_gender='M';
		sachin.emp_salary=2435.735f;
		Employee.team="MI";
		
		sachin.emp_info();
		
		Employee pooja =new Employee();
		
		pooja.emp_name="Pooja Talekar";
		pooja.emp_dept="Electrical";
		pooja.emp_id=2363;
		pooja.emp_gender='F';
		pooja.emp_salary=5345.435f;
		
		pooja.emp_info();

	}

}
