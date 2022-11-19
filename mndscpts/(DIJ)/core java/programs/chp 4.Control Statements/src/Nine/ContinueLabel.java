package Nine;
//Jump Statements:Using continue with a label


public class ContinueLabel 
{

	public static void main(String[] args) 
	{
		outer: for (int i = 0; i < 10; i++)
			/*continue statement in this example terminates the loop counting j and continues with
			 *the next iteration of the loop counting I */
		{
			for (int j = 0; j < 10; j++)
			{
				if (j>i) 
				{
					System.out.println();
					continue outer;
				}
				System.out.print(" "+(i * j));
			}
		
		}
	System.out.println();
	}
}

