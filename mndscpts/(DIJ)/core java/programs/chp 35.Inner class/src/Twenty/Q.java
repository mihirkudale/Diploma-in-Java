package Twenty;

public class Q {
	static class R implements QQ
	{
		public void test() {
			System.out.println("from interface test()");
		}
	}
	public static void main(String[] args) {
		R r1=new R();
		r1.test();
	}

}
