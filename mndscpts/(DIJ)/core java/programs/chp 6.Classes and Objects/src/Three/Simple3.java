//Non-static Members,need to create Reference variable
package Three;

public class Simple3 {
	int a=90;//Non-static Variables
	void test()//Non-static Methods
	{
		System.out.println("Running Test method");
	}

	public static void main(String[] args) 
	{
		Simple3 s3=new Simple3();
		s3.test();
		System.out.println("Value of a "+s3.a);//Access Global variable "a"
	}

}
