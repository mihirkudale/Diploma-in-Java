package Eighteen;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Bank rv=new Bank();
		int opt;
		do
		{
			System.out.println("1:balance \t 2:Deposit");
			System.out.println("3.WithDraw \t 4.Exit");
			System.out.println("What's your option?");
			opt=scan.nextInt();
			switch (opt) {
			case 1:rv.balance();
			System.out.println();
			rv.balance();
			break;
			case 2:System.out.println("Please Enter deposit amount");
			int damount=scan.nextInt();
			rv.deposit(damount);
			break;
			case 3:System.out.println("please enter the withdraw amount");
			int wamount=scan.nextInt();
			rv.withdraw(wamount);
			break;
			case 4:System.out.println("Thank You");
			break;
			default:System.out.println("Invalid option");
			}
		}
		while(opt!=4);
		{
			scan.close();
		}
	}
	private void withdraw(int wamount) {
		
	}
	private void deposit(int dqamount) {
		
	}
	private void balance() {
		
	}

}
