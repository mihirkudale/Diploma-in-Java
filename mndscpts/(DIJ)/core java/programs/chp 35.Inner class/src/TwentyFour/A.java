package TwentyFour;



class B
{
	public void test() {
		System.out.println("from B");
	}
}
public class A {

	public static void main(String[] args) {
		B b1=new B() {
			
		};
		b1.test();
	}

}

