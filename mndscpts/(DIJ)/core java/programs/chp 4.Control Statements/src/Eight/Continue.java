//Jump Statements:Demonstrate continue
package Eight;



public class Continue 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 10;i++)
		{
			if (i%2==0)
//this code uses % operator to check if i is even.If it is,the loop continues without printing newline.
				continue;
			System.out.println(i +" ");
		}
	}
}