package Five;
//Jump Statements:Using break with nested loops


public class BreakLoop3 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i < 3; i++) 
		{
			System.out.print("Pass "+i+":");
			for (int j = 0; j <100; j++) 
			{
				if (j==10) 
				break;//terminate loop if j is 10
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Loops complete.");
	}
}



