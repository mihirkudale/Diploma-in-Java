package One;

class Z
{
	@Override
	public void finalize() throws Throwable {
		System.out.println("running finding method");
		super.finalize();
	}
}
public class T {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Z z1=new Z();
		z1=new Z();
		System.gc();

	}

}
