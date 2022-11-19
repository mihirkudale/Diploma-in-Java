//Variables 
package variables16;

public class Simple22 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5;i++)
		{
			for (int j = 1; j <= i;j++)
			{
				System.out.print((i+j)%2);
			}
			
			System.out.println();
		}

	}

}

/*i=1;j=1=>System.out.println((1+1)/2)
 *i=2;j=1->2=>System.out.println((2+1)/2)
 */
