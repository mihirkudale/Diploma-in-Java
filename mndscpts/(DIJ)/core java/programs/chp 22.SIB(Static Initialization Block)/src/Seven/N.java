package Seven;

public class N {
	{
		System.out.println("IIB");
	}
	static
	{
		new N();//IIB will be called by using the statement
		System.out.println("SIB");
	}
	N()
	{
		System.out.println("N()");
	}
	public static void main(String[] args) {
		//new N();
			System.out.println("main");
	}

}
