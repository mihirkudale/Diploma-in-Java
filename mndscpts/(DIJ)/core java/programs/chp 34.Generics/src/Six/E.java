package Six;

public class E<x> {
	x i;//generic cannot be applied on local variable
	@SuppressWarnings("rawtypes")
	E e1;
	@SuppressWarnings("rawtypes")
	public x test() {
		e1=new E();
		e1.i=60.6f;
		return i;
	}
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		E e2=new E();
		e2.test();
		System.out.println(""+e2.i);
		System.out.println(""+e2.test());
	}

}
