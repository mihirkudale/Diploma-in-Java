package Four;

public class Adam {
	static int reverse(int num)
	{
		int res=0;
		while (num!=0) {
			int temp=num%10;
			res=temp+(res*10);
			num=num/10;
		}
		return res;
	}
	static int square(int num)
	{
		int res;
		res=num*num;
		return res;
	}
	public static void checkAdam(int num,int res) {
		if (num==res) {
			System.out.println("the number is Adam");
		}
		else {
			System.out.println("The number is not Adam");
		}
	}
	public static void main(String[] args) {
		int num=121;
		System.out.println("the no is "+num);
		int num1=Adam.square(num);
		int res1=Adam.reverse(num);
		int num2=Adam.square((res1));
		Adam.checkAdam(num1, num2);
	}
}