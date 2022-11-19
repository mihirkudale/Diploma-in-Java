package dynamicinitialization;
//Dynamic Initialization:program that computes length of the hypotenuse of a right triangle given the lengths of its two opposing sides:

public class DynInit {

	public static void main(String[] args) {
		double a=3.0,b=4.0;
		//c is dynamically initialized 
		double c=Math.sqrt(a*a+b*b);
		System.out.println("Hypotenuse is "+c);
		
	   

	}

}
