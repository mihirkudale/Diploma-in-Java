//Variable ch declared inside for loop
package variables14;

public class Simple20 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5;i++)
			{
			char ch='A';
			//Character will be referenced and will always start from A
			for (int j = 1; j <= i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			
			System.out.println();
		}

	}

}
