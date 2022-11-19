package Six;
class Z
{
	
}
public class E {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Z z1=null;
		//Z z=new
				//Z();
		try {
					System.out.println(z1.hashCode());
				} catch (ArithmeticException e) {
					System.out.println("caught!");
				}
				finally {
					System.out.println("Running Finally block \n");
				}
	

	}

}
