package Five;

class H
{
	H(int a)
	{
		System.out.println("from H(int a) constructor");
	}
}
class I extends H
{
	I()
	{
		super(90);//will not work when double/float value is used
		System.out.println("from I(int a) constructor");
	}
}
public class Supermain2 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		I rv=new I();

	}

}
