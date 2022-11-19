package Fifteen;

import java.io.IOException;
import java.util.Scanner;

public class O {

	public static void main(String[] args) throws IOException {
		String pwd="Qspiders";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter one number");
		int a=scan.nextInt();
		System.out.println("Please Enter another number");
		int b=scan.nextInt();
		System.out.println("Please enter password for result");
		String s=scan.nextLine();
		if (pwd.equals(s)) 
		{
			int sum=a+b;
			System.out.println("result is" +sum);
		}
		else
		{
			System.out.println("sorry incorrect password");
		}
		scan.close();
	}

}
