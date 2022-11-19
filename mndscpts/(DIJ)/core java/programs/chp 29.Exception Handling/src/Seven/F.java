package Seven;

public class F {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int a=10/0;
		} catch (NumberFormatException e) {
			System.out.println("Running 1st catch");
		}
		catch (Exception e) {
			System.out.println("Running 2nd catch");
		}

	}

}
