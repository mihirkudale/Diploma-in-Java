package Three;
class Account
{
	private double balance=5000;
	double getBalance()
	{
		return balance;
	}
	public void setBalace(double tamount)
	{
		if(tamount>0)
		{
			balance+=tamount;
			System.out.println("Transferred" +tamount);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
}
class Tester3
{
	public static void main(String[] args)
	{

	Account a=new Account();
	System.out.println("Balance="+a.getBalance());
	a.setBalace(1000);
	System.out.println("Balance="+a.getBalance()+"Rs");
	a.setBalace(-6000);
	System.out.println("Balance"+a.getBalance()+"Rs");
    }
}
