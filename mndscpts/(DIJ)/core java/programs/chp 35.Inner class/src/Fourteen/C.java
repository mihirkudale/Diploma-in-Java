package Fourteen;

public class C {
	static class D
	{
		static {
			System.out.println("SIB");
		}
		D()
		{
			System.out.println("constructor");
		}
		{
			System.out.println("IIB");
		}
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		D d1=new D();
	}
	}
}
