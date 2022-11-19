package Two;

  class Sample
{
	private int a;
	private double d;
	Sample(int a,double d)
	{
		this.a=a;
		this.d=d;
	}
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public double getD()
	{
		return d;
	}
	public void setD(double d)
	{
		this.d=d;
	}
}
public class Tester2
{
	public static void main(String[] args)
	{
		Sample s=new Sample(10,10.5);
		System.out.println("value of a "+s.getA());
		System.out.println("Value of d "+s.getD());
		s.setA(90);
		s.setD(90.5);
		System.out.println("Value of a is "+s.getA());
		System.out.println("Value of d is "+s.getA());
	}
}
