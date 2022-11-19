package Six;

class Employee
{
	int empId;
	Employee(int empId) 
	{
		this.empId=empId;
	}
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		if (this.empId==e.empId) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
public class Tester5 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(10);
		Employee e2=new Employee(10);
		System.out.println(e1.equals(e2));
		Employee e3=new Employee(30);
		Employee e4=new Employee(40);
		System.out.println(e3.equals(e4));
	}
	
}