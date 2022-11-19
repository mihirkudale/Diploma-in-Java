package Five;

public class P {
	{
		System.out.println("IIB");
	}
	P()
	{
		System.out.println("P()");
	}
	static
	{
		System.out.println("SIB");
	}
	public static void main(String[] args) {
		new P();
		System.out.println("main");
	}

}
