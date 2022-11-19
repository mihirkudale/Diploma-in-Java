package Four;

class X
{
	
}
public class D {
	static void fun(Object obj)
	{
		System.out.println("done");
	}
	public static void main(String[] args) {
		fun(new Object());
		fun(new String("Hello"));
		fun("hi");
		fun(new Integer(10));
		fun(90.5);
		fun('A');
		fun(true);
	}

}
