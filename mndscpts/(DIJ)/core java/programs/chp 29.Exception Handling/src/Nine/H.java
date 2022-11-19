package Nine;

public class H {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int[] arr=new int[-10];
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println("Caught");
		}

	}

}
