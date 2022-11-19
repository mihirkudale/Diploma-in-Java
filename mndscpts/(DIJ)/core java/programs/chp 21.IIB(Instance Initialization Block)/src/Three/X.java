package Three;

public class X {
	X()
	{
		System.out.println("from Constructor");
	}
	{
		System.out.println("from IIB");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		X x1=new X();//IIB
		System.out.println("from main");
	}

}
