package Two;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("Main Ends");
	}

}
