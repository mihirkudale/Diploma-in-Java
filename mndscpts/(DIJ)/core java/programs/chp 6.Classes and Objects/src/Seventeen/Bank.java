package Seventeen;

public class Bank {
	int balance;//non-static variable
	void balance()//non-static method
	{
		System.out.println("Current balance is:"+balance);
	}
	void deposit(int damount)//
	{
		balance=balance+damount;//non-static members can be accessed directly from another non-static context
		System.out.println("you have deposited:" +damount+"Rs");
		balance();
	}
	void withdraw(int wamount)//non-static method
	{
		if(wamount<=balance)
		{
			balance=balance-wamount;
			System.out.println("you have withdrawn:" +wamount+"Rs");
		}
		else
		{
			System.out.println("insufficient balance:");
		}
		balance();
	}
	public static void main(String[] args) {
		System.out.println("Welcome to HDFC bank");
		Bank b=new Bank();
		b.balance();
		System.out.println("Transaction details");
		b.deposit(10000);
		System.out.println("Transaction details");
		b.withdraw(10000);
		System.out.println("Transaction details");
		b.withdraw(10000);
	}

}
