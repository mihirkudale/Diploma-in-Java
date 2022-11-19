package Three;

public class Simple2 {
	static void show(int a)
	{
		System.out.println("Input received is: " +a);
	}
	void show(double d)
	{
		System.out.println("Input received is: " +d);
	}
	public static void main(String[] args) {
		show(10);
		Simple2 s2=new Simple2();
		s2.show(20.5);
	}

}
