package Three;

class C
{
	public void test1() {
		System.out.println("public test1()");
	}
	protected void test2() {
		System.out.println("protected test2()");
	}
	void test3()
	{
		System.out.println("     Test3()");
	}
	@SuppressWarnings("unused")
	private void test4() {
		System.out.println("Private test4()");
	}
}
public class D extends C {
	public static void main(String[] args) {
		D d=new D();
		d.test1();
		d.test2();
	}

}
