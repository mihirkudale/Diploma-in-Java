package Six;

public class Sample {
	Sample(int a)//Constructor
	{
		System.out.println("from sample(int a)"+a);
	}
	Sample(int a, double d)//Constructor Overloaded
	{
		this(a);
		System.out.println("From Sample(int a,double d)"+a+" "+d);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Sample rv=new Sample(90, 20.5);
	}

}
