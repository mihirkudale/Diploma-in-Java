package Eight;

public class Test8 {

	public static void main(String[] args) {
		String rv="AIDNI";
		System.out.println("The original string is " +rv);
		System.out.println("the reverse string is ::");
		for (int i=rv.length()-1;i>=0;i--) 
		{
			System.out.print(rv.charAt(i));
		}

	}

}
