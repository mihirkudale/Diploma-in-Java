//Variables
package variables12;

public class Simple18 
{

	public static void main(String[] args) 
	{
		int a=1; //2//3//4
			for (int i = 1; i < 5;i++)//outer loop
			{
				for (int j = 1; j <= i;j++)//inner loop
				{
					System.out.print(a);
					a++;
				}
				
				System.out.println();
			}
	}

}

