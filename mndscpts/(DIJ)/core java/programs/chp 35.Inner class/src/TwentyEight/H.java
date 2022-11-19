package TwentyEight;

public class H {
	static class I
	{
		public void test() {
			System.out.println("test-B");
		}
	}
	public static void main(String[] args) {
		I i1=new I() {
			public void test() {
				System.out.println("test-anonymous");
			}
		};
		i1.test();
	}

}
