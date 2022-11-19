package Two;

public class Calculate {
	static void area(int side)
	{
		int  a=side*side;
		System.out.println("Area of square is" +a);
	}
	static void area(int length,int breadth)
	{
		int a=length*breadth;
		System.out.println("Area of rectangle is" +a);
	}
	static void area(double radius)
	{
		double d=3.14*radius*radius;
		System.out.println("Area of circle is" +d);
	}
	public static void main(String[] args) {
		area(2);
		area(2, 3);
		area(3.0);

	}

}
