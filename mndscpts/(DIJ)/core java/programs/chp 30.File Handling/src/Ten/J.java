package Ten;

public class J {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int a[]=new int[999999999];
		} catch (OutOfMemoryError e) {
			System.out.println("caught");
		}

	}

}
