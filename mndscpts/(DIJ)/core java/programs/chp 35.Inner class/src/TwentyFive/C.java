package TwentyFive;


class B {
	public void test1() {
		System.out.println("from B");
	}
}
public class C {
	public static void main(String[] args) {
		B b1=new B()//Anonymous class extends B
		{
			@SuppressWarnings("unused")
			public void test() {
				System.out.println("from B");
			}
		};
		b1.test1();
	}	
}
