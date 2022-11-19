package One;

public class A 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		try 
		{
			int a= Integer.parseInt("hey");		
		}			
		catch(NumberFormatException e) 
		{
			System.out.println("caught");
		}

	}

}
