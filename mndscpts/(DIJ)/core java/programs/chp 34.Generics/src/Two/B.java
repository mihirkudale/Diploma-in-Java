//Generic class
package Two;

public class B<x> {
	x i;
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		B b1=new B();
		b1.i=10.5;
		System.out.println(b1.i);
	}

}
