package Two;

class D
{
	int i;
}
class C
{
	void test1()
	{
		System.out.println("non-static method");
	}
}
public class B {

	public static void main(String[] args) {
		System.out.println(new D().i);
		new C().test1();
		System.out.println(new String("qspiders").toUpperCase());
		System.out.println("Jspiders".length());

	}

}
