package Eight;

public class M {
	static {
		System.out.println("SIB");
	}
	static {
		System.out.println("Hello");
		new M();//IIB will be called
	}
	{
			System.out.println("IIB");
	}
	public static void main(String[] args) {
		new M();
		System.out.println("main");
	}

}
