package Eleven;

class M
{
	public static void test() throws Exception {
		@SuppressWarnings("unused")
		int i=10/0;
	}
}

public class L {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		M m1=new M();
		try {
			m1.test();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
