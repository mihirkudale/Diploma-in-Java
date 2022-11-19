package Five;

class Z
{
	
}
public class Tester4 {

	public static void main(String[] args) {
		Z z=new Z();
		Z z2=new Z();
		System.out.println(z.equals(z2));
		Z z3=new Z();
		z2=z3;
		System.out.println(z3.equals(z2));
	}

}
