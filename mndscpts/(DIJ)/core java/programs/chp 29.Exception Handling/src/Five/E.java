package Five;
class Z
{
	
}
public class E 
{
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Z z1=null;
		Z z=new
	    Z();
		try 
				{
					System.out.println(z.hashCode());
				} 
				catch (ArithmeticException e) 
				{
					System.out.println("caught!");
				}
				finally 
				{
					System.out.println("Running Finally block \n");
				}
	}

}
