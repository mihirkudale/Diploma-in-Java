//Single Level Inheritance
package One;

class A
{
	int a=10;
	void test1()
	{
		System.out.println("Running test1");
	}
}
class B extends A
{
	double d=10.5;
	void demo1()
	{
		System.out.println("Running demo2");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		B rv=new B();
		System.out.println(+rv.a);
		rv.test1();
		System.out.println(+rv.d);
		rv.demo1();
	
	}
}