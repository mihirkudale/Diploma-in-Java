package Five;

public class F<x> {
	x i;
	x j;
	x k;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		F f1=new F();
		f1.i=30;
		f1.j=40.4;
		f1.k=50.5f;
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(f1.k);
	}

}
