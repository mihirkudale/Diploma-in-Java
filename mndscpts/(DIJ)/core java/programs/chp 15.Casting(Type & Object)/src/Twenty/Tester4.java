//object casting
package Twenty;

class Sample10
{
	void test1() {
		System.out.println("Running test1() of class Sample10");
	}
}
class Sample11 extends Sample10
{
	void test2() {
		System.out.println("Running test2() of class Sample11");
	}
}
public class Tester4 {

	public static void main(String[] args) {
		Sample10 s10=new Sample11();
		Sample11 s11=(Sample11)s10;
		s11.test1();
		s11.test2();
	}

}
