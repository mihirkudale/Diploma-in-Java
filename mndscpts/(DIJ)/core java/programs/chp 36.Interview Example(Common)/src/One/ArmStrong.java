//Program to find ArmStrong number
package One;

public class ArmStrong {
	static int sumofDigitsCube(int num)
	{
		int res=0;//173
		while(num!=0)//371
		{
			int temp=num%10;//371%10=71;
			res=res+(temp*temp*temp);
			num=num/10;
		}
		return res;
	}
	static void checkArmStrong(int num,int res)
	{
		if (num==res) {
			System.out.println("the number "+num+" is ArmStrong");
		}
		else {
			System.out.println("the number "+num+" is not ArmStrong");
		}
	}
	public static void main(String[] args) {
		int num=371;
		int res=ArmStrong.sumofDigitsCube(num);
		ArmStrong.checkArmStrong(num, res);
	}

}
