//Multiple Generics(any number of Generic representations)
package Four;

public class D <X,Y,Z> {
	X a;
	Y b;
	Z c;
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		D d1=new D();
		{
			d1.a=10;
			d1.b=20.3;
			d1.c=30.3f;
			System.out.println(d1.a);
			System.out.println(d1.b);
			System.out.println(d1.c);
		}
	}

}
