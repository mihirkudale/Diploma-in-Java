package One;

public class Simple1 {
	static void square(int num) {
		int sq=num*num;
		System.out.println("Result is " +sq);
		return;
	}

	public static void main(String[] args) {
		Simple1.square(2);//Method invocation
	}

}
