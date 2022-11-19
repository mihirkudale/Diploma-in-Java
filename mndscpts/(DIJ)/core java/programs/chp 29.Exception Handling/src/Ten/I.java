package Ten;

public class I {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int a=10/0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("1st caught");
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("2nd caught");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("2nd caught");
		}
		catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println("2nd caught");
		}

	}

}
