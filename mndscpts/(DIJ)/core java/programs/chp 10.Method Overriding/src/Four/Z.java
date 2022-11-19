package Four;

public class Z {
	Z()//Constructor
	{
		System.out.println("from A()");
	}
	Z(int a)//Constructor
	{
		this();//tcs
		System.out.println("from A(int a)");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Z rv=new Z(90);
	}

}
