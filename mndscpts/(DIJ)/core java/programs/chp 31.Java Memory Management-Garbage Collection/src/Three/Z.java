package Three;

class Sample
{
	static String test()
	{
		return "java Programming";
	}
}
class Demo
{
	public String test2() {
		return "selenium";
	}
}
public class Z {

	public static void main(String[] args) {
		System.out.println(Sample.test().length());
		System.out.println(new Demo().test2().length());
	}

}
