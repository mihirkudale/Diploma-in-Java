//To access non-static Members
package One;

public class Simple1 {
	void test()
	{
		System.out.println("Running test method()");
	}
	public static void main(String[] args) {
		Simple1 s=new Simple1();
		s.test();
	}

}
