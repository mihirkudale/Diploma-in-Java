package Three;

public class C {
	class D
	{
		public void test() {
			System.out.println("from test");
		}
	}
	public static void main(String[] args) {
		C c1=new C();
		D d1=c1.new D();
		d1.test();
	}

}
