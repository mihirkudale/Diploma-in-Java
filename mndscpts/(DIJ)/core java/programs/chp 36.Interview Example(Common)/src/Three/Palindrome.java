package Three;

public class Palindrome {
	static int reverse(int num)
	{
		int res=0;
		while(num!=0)
		{
			int temp=num%10;
			res=temp+(res*10);
			num=num/10;
		}
		return res;
	}
	static void checkPalindrome(int num,int res)
	{
		if (num==res) {
			System.out.println("the number "+num+" is palindrome");
		}
		else {
			System.out.println("the number "+num+" is not palindrome");
		}
	}
	public static void main(String[] args) {
		int num=121;
		int res=Palindrome.reverse(num);
		Palindrome.checkPalindrome(num, res);
	}

}
