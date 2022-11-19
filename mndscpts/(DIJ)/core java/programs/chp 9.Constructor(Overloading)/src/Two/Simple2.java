package Two;

public class Simple2 {

	Simple2()
	{
		System.out.println("Running Demo1 constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		@SuppressWarnings("unused")
		Simple2 s2=new  Simple2();
		System.out.println("-------");
		@SuppressWarnings("unused")
		Simple2 s22=new Simple2();
		System.out.println("Main Ends");
		

	}

}
