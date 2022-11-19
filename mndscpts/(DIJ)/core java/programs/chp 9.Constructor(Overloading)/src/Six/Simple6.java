//Parameterized Constructor
package Six;

public class Simple6 {
	int empId;
	Simple6(int id)
	{
		empId=id;
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Simple6 s6=new Simple6(10);
		System.out.println("Employee id is :"+s6.empId);
		Simple6 s66=new Simple6(20);
		System.out.println("Employee id is :"+s66.empId);
		System.out.println("Main Ends");
	}

}
