//primitive casting
package Nine;

public class I {
	static double purchaseAmount=95.5;
	static double receivePayment(double payedAmount)
	{
		double change=payedAmount-purchaseAmount;
		return change;
	}
	public static void main(String[] args) {
		double change=receivePayment(100);
		System.out.println("Change to be given to the customer is "+change);
	}

}
