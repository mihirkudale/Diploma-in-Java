package Three;

public class B {

	public static void main(String[] args) {
		int age=100;
		try {
			assert age>20;
			System.out.println("Register your self");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("You are too young");
		}

	}

}
