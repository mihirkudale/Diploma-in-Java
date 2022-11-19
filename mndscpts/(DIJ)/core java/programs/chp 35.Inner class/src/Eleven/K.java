package Eleven;

public class K {
	class L
	{
		int i;
		{
			@SuppressWarnings("unused")
			int j=20;
			System.out.println("from IIB");
		}
		L()
		{
			System.out.println("from constructor");
		}
		
	}
	public static void main(String[] args) {
		K k1=new K();
		L l1=k1.new L();
		System.out.println(l1.i);
	}

}
