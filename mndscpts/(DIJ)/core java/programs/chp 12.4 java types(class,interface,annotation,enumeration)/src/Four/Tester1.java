package Four;

interface A
{
	void test1();
	void test2();
}
class B implements A
{
	@Override
	public void test1()
	{
		System.out.println("test1() overridden in Class B");
	}
	@Override
	public void test2()
	{
		System.out.println("test2() overridden in Class B");
	}
}
public class Tester1 {

	public static void main(String[] args) {
		/*A rv=new A();//we cannot create objects of interface and A is abstract and cannot be
		  instantiated*/
		B b1=new B();
		b1.test1();
		b1.test2();
	}

}
