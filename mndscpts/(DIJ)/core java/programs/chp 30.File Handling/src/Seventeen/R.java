package Seventeen;

import java.util.Arrays;
import java.util.Scanner;

public class R {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the size of Array");
		int size=scan.nextInt();
		double[] darr=new double[7];
		System.out.println("please Enter "+size+ "elements");
		for (int i = 0; i < size; i++) {
			darr[i]=scan.nextDouble();
		}
		System.out.println("The"+size+ "elements are");
		for (int i = 0; i < size; i++) {
			System.out.println(darr[i]);
		}
		System.out.println("Sort?? Yes or No");
		String opt=scan.next();
		if (opt.equalsIgnoreCase("yes")) {
			Arrays.sort(darr);
			for (int i = 0; i < size; i++) {
				System.out.println(darr[i]);
			}
		}
		else
		{
			System.out.println("Thank you");
		}
		scan.close();
	}

}
