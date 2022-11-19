//object casting
package Eighteen;

class Sample3
{
	int a=10;
}
class Sample4 extends Sample3
{
	double d=10.5;
}
class Sample5 extends Sample4
{
	char ch='z';
}
public class Tester2 {

	public static void main(String[] args) {
		Sample4 s4=new Sample5();
		System.out.println("The value of a is "+s4.a);
		//System.out.println("The value of d is "+s4.d);
		//System.out.println("The value of ch is "+s4.ch);
		
		//Sample3 s3=new Sample5();
		
		//System.out.println("The value of a is "+s3.a);
		//System.out.println("The value of d is "+s4.d);
		//System.out.println("The value of ch is "+s4.ch);
		
		Sample5 s5=new Sample5();
				System.out.println("The value of d is "+s4.d);
				System.out.println("The value of ch is "+s5.ch);
	}

}
