package Nine;

public class L {
	public void test() {
		System.out.println("test()");
	}
	public static void main(String[] args) {
		new L().test();
	}
	{
		System.out.println("IIB");
	}
	L()
	{
		System.out.println("L()");
	}

}
