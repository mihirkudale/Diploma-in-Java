//Immutable Object Design Pattern
package Two;

class Demo
{
	private int i;
	private double j;
	Demo(int i,double j)//Constructor 
	{
		this.i=i;
		this.j=j;
	}
	public int  getI() 
	{
		return i;
	}
	public double getJ()
	{
		return j;
	}
}
public class Tester1 {

	public static void main(String[] args) {
		Demo rv1=new Demo(8,8.5);
		System.out.println("rv1.getI()");
		System.out.println(rv1.getI());
		Demo rv2=new Demo(9,9.5);
		System.out.println("rv2.getJ()");
		System.out.println(rv2.getJ());
	}

}
