package Six;

public class E {

	public static void main(String[] args) {
		assert test();
		System.out.println("from main");
	}
	public static boolean test() {
		System.out.println("from test");
		return true;
	}

}
