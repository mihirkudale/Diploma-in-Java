package Two;

public class B {
	class C
	{
		int i=10;
	}
	public static void main(String[] args) {
		B b1=new B();
		C c1=b1.new C();
		System.out.println(c1.i);

	}

}
