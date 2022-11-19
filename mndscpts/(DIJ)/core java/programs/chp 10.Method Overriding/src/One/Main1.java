package One;
class C
{
	void test1()
	{
		System.out.println("Running test1 of A class");
	}
}
class D extends C
{
	void test1()
	{
		System.out.println("Running test1 of B class");
	}
}
public class Main1 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		D rv=new D();
		rv.test1();
		System.out.println("Main Ends");
	}

}
