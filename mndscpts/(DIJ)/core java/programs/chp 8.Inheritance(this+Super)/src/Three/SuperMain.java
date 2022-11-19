//Super
package Three;
class A
{
	A()
	{
		System.out.println("Constructor of A class");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Constructor of B class");
	}
}
class C extends B
{
	C()
	{
		super();
		System.out.println("Constructor of C class");
	}
}
public class SuperMain {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		@SuppressWarnings("unused")
		C rv=new C();
		System.out.println("Main Ends");
	}

}
