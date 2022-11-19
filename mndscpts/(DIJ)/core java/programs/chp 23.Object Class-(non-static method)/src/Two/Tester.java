package Two;

class Sample
{
	
}
public class Tester {

	public static void main(String[] args) {
		Sample s=new Sample();
		Sample s2=new Sample();
		System.out.println(s.toString());
		System.out.println(s2.toString());
		Sample s3=new Sample();
		Sample s4=s3;
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
