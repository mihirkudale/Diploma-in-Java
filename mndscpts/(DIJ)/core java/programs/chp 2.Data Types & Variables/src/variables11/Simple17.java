//Variables 
package variables11;

public class Simple17 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5;i++)//Outer Loop 
		{
			for (int j = 1; j <= i;j++)//Inner Loop 
			{
				System.out.print("*");//Printing *
			}
			{
				System.out.println("");//Number of rows
				
			}
		}

	}

}

/* Execution:
 * Step 1:
 * when i=1,is 1<=5? true then go to inner loop when j<=i,i.e., 1<=1? true
 * print*
 * now 2<=1? false then go to outer loop
 * Step 2:
 * when i=2,is 2<=5? true then go to inner loop when j<=i,i.e., 1<=2? true & 2<=2? true
 * print**
 * now 3<=2? false then go to outer loop
 *  Step 3:
 * when i=3,is 3<=5? true then go to inner loop when j<=i,i.e., 1<=3? true & 2<=3? true also 3<=3? true
 * print***
 * now 4<=3? false the go to outer loop
 * Step 4:
 * when i=4,is 4<=5? true then go to inner loop when j<=i,i.e., 1<=4? true & 2<=4? true 3<=4? true 4<=4? true
 * print****
 * now 5<=4? false the go to outer loop
 * Step 5:
 * when i=5,is 5<=5? true then go to inner loop when j<=i,i.e., 1<=5? true & 2<=5? true 3<=5? true 4<=5? true 5<=5? true
 * print*****
 * Exit
 */
