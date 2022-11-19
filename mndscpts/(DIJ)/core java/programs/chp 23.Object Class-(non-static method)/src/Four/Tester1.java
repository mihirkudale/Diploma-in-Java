package Four;

class B
{
	public String toString()
	{
		return "B class Object";
	}
}
public class Tester1 {

	public static void main(String[] args) {		
		B b=new B();
		System.out.println(b);
		B b1=new B();
		System.out.println(b1);
	}

}
