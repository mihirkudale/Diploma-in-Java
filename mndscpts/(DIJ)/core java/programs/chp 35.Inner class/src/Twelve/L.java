package Twelve;

public class L {
	class M implements AA
	{
		public void test()
		{
			System.out.println("from test()");
		}
	}
	public static void main(String[] args) {
		L l1=new L();
		M m1=l1.new M();
		m1.test();
	}

}
