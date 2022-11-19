//object casting
package TwentyOne;

class Sample12
{
	void test1() {
		System.out.println("test1()");
	}
}
class Sample13 extends Sample12
{
	void test2() {
		System.out.println("test2()");
	}
}
public class Tester5 {

	public static void main(String[] args) {
		Sample12 s12=new Sample12();
		Sample13 s13=(Sample13)s12;
		s13.test1();
		s13.test2();
	}

}
