//object casting
package Seventeen;

class Sample1
{
	void test1()
	{
		System.out.println("test1 of super-class sample1");
	}
}
class Sample2 extends Sample1
{
	void test2()
	{
		System.out.println("test2 of super-class sample2");
	}
}
public class Tester1 {

	public static void main(String[] args) {
		Sample1 s1=(Sample1)new Sample2();
		s1.test1();
		//s1.test2();

	}

}
