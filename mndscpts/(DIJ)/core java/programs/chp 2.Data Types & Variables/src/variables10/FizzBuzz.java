/*Variables:Print Fizz if the number is completely divisible by 3,and print buzz if  
 * divisible by 5 and print FizzBuzz if the number is completely divisible 
 * by both 3 and 5  between the range of number 1 till 20.
 */

package variables10;

public class FizzBuzz {
/*first print the FizzBuzz condition because i%3==0 && i%5==0 may skip the
*2nd condition.
*/
	public static void main(String[] args) {
		for (int i = 1; i <= 20;i++) 
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz" +i);
			}
			else if (i%3==0) {
				System.out.println("Fizz" +i);
			}
			else if (i%5==0) {
				System.out.println("Buzz" +i);
			}
		}

	}

}
