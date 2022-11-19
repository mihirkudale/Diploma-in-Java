package Seven;

class G
{
	void test1()
	{
	    System.out.println("test1() of class F");
	}
}
interface H
{
	void test2();
}
class I extends G implements H
{
	@Override
	public void test2()
	{
		System.out.println("test2() overridden in class H");
	}
}
public class Tester4 {

	public static void main(String[] args) {
		I i1=new I();
		i1.test1();
		i1.test2();
	}

}
