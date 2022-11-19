package Nineteen;

import java.util.Scanner;

public class S {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter one number");
		int a=scan.nextInt();
		System.out.println("please enter another number");
		int b=scan.nextInt();
		if(a>=b)
		{
			System.out.println("The result is "+(a-b));
		}
		else
		{
			throw new ArithmeticException("first No.should be greater than second no.");
		}
	}

}
