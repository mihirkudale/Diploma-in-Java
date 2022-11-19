package One;

abstract class A
{
	abstract void test1();//only declaration
	abstract void test2();//only declaration
}
class B extends A//inheriting abstract class A
{
	@Override
	void test1()//Declaration
	{
		System.out.println("test1() is overridden in class B");//Definition 
	}
	@Override
	void test2()//Declaration
	{
		System.out.println("test2() is overridden in class B");//Definition 
	}
}
public class Tester1 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		//A a=new A();
		//Class A is abstract and cannot be instantiated 
		B b=new B();
		b.test1();
		b.test2();
	}

}
