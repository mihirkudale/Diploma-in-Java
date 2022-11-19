package TwentySix;

class D
{
	public void test() {
		System.out.println("from test()");
	}
}
public class E {

	public static void main(String[] args) {
		D d1=new D() {
			
		};
		d1.test();
	}

}
