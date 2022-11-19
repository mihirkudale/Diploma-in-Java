package Sixteen;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter one string");
		String s1=scan.nextLine();
		System.out.println("please enter one word");
		@SuppressWarnings("unused")
		String s2=scan.next();
		System.out.println("enter you replacement word");
		String s3=scan.next();
		s1=s1.replaceAll(s1, s3);
		System.out.println(s1);
		scan.close();

	}

}
