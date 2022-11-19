package SIx;

public class Test6 {

	public static void main(String[] args) {
		String rv="I love India";
		System.out.println(rv.length());
		System.out.println(rv.charAt(3));
		System.out.println(rv.charAt(8));
		System.out.println("------");
		System.out.println(rv.indexOf('v'));
		System.out.println(rv.indexOf('I'));
		System.out.println("---------");
		System.out.println(rv.toLowerCase());
		System.out.println(rv.toUpperCase());
		System.out.println(rv.startsWith("i love"));
		System.out.println(rv.endsWith("America"));
		System.out.println("------");
		System.out.println(rv.contains("Love"));
		System.out.println("------");
		System.out.println(rv.substring(2));
		System.out.println(rv.substring(2, 9));
		System.out.println("------");
		System.out.println(rv.isEmpty());

	}

}
