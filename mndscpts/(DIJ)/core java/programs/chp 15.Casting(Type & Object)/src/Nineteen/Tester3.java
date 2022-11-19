//object casting
package Nineteen;

class Sample6
{
	void test()
	{
		System.out.println("test() super class implementation");
	}
}
class Sample7 extends Sample6
{
	void test()
	{
		System.out.println("test() of sub class implementation");
	}
}
public class Tester3 {

	public static void main(String[] args) {
		Sample6 s6= new Sample7();
		s6.test();
	}

}
