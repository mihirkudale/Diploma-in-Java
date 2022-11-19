package Three;

public class C<Z> {
	 Z i;
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		C c1=new C();
		c1.i=10.3f;
		c1.i=20;
		c1.i=30;
		System.out.println(c1.i);
	}

}
