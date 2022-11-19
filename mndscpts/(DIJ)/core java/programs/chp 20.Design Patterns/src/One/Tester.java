//Singleton Object Design Pattern
package One;

class A
{
	static A a1=null;
	private A() //1. Private Constructor
	{
		System.out.println("Running Private Constructor");
	}
	void m1()
	{
		System.out.println("non-static method");//Referred multiple times by the Single Object
	}
	public static A demo() {
		if (a1==null) 
		{
			a1=new A();
		    return a1;//2. returns 1 object of a class
	}
		else
		{
			return a1;
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		A rv1=A.demo();
		rv1.m1();
	    A rv2=A.demo();
		rv2.m1();
		A rv3=A.demo();
		rv3.m1();
	}

}
