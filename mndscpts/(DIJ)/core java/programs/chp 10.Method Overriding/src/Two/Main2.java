package Two;

class A
{
	void test1()
	{
		System.out.println("Super class Implementation");
	}
}
class B extends A
{
	void test1()
	{
		super.test1();
		System.out.println("Sub class Implementation");
	}
}
public class Main2 {
	
	public static void main(String[] args) {
		A rv=new B();
		rv.test1();
	}

}
