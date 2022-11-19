//Immutable Object Design Pattern
package Three;

class Simple
{
	final int a;//State cannot be changed
	Simple(int a)
	{
		this.a=a;
	}
}

public class Tester2 {

	public static void main(String[] args) {
		Simple rv1=new Simple(10);
		System.out.println(rv1.a);
		Simple rv2=new Simple(20);
		System.out.println(rv2.a);
	}

}
