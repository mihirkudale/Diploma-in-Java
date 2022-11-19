package Thirteen;

public class A {
	static class B{
		static int i;
		int j=20;
	}

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(B.i);//SIB
		System.out.println(b1.j);//IIB
	}

}
