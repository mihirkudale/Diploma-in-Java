//Compiler providing Default Super calling statement
package Four;
class D
{
	D()
	{
		System.out.println("From D Constructor");
	}
}
class E extends D
{
	E()
	{
		//super();//->Default Super calling(Commented Delibrately
		System.out.println("From E Constructor");
	}
}

public class SuperMain1 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		@SuppressWarnings("unused")
		E rv=new E();
		System.out.println("Main Ends");

	}

}
