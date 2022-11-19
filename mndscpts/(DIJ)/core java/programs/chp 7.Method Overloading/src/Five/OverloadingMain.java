package Five;

public class OverloadingMain {
	public static void main(int a)
	{
		System.out.println("Main(int a)");
	}
	public static void main(double a)
	{
		System.out.println("Main(double a)");
	}
	public static void main(String[] args) {
		main(10);
		main(10.5);	
	}

}
