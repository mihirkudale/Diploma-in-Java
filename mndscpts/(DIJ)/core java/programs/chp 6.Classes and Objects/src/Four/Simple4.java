//Static Members,need not create reference variable,just access using classname.staticmember-name
package Four;

public class Simple4 {
	static int a=90;//Static variable
	static void test()//static member
	{
		System.out.println("Running test method");
	}
	public static void main(String[] args) {
		System.out.println("Value of a is " +Simple4.a);
		Simple4.test();
	}
}
