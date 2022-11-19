package Eleven;

public class J {
	{
		System.out.println("IIB");
	}
	static
	{
		new J();//run's first
		System.out.println("SIB");//run's second
		new J();//run's third
	}
	public static void main(String[] args) {
		System.out.println("from main");
	}

}
