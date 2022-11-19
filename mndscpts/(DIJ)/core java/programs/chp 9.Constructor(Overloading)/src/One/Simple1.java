package One;

public class Simple1 {
	Simple1()
	{
		System.out.println("Running Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		@SuppressWarnings("unused")
		Simple1 s1=new Simple1();
		System.out.println("Main Ends");

	}

}
