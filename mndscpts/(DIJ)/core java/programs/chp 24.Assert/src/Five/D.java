package Five;

public class D {

	public static void main(String[] args) {
		assert test();
		System.out.println("From main()");
	}
	public static boolean test() {
		System.out.println("from test()");
		return false;
	}

}
