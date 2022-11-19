//Program to perform swapping of 2 numbers stored in the variables without using temp variable.
package Nine;

public class Simple9 {
	static void swap(int a,int b)
	{
		a=(b-a)+(b=a);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("After Swapping");
		Simple9.swap(a, b);
	}

}
