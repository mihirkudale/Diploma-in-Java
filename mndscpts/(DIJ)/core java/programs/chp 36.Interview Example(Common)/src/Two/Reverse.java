//Program to reverse number
package Two;

public class Reverse {
	static int reverse(int num)
	{
		int res=0;
		while(num!=0)
		{
			int temp=num%10;
			res=temp+(res*10);
			num=num/10;
		}return res;
	}
		public static void main(String[] args) {
			int num=354;
			int res=Reverse.reverse(num);
			System.out.println("Number is "+num);
			System.out.println("Reverse number is "+res);
	}

}
