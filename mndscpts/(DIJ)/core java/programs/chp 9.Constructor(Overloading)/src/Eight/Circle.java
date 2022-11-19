package Eight;

public class Circle {
double radius;
Circle(double r)
{
	radius=r;
	double a=3.14*radius*radius;
	System.out.println("Area is:" +a);
}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Circle c1=new Circle(2.3);
		@SuppressWarnings("unused")
		Circle c2=new Circle(5.2);
	}

}
