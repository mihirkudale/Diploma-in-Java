package Seven;

class N
{
	
}
public class Tester6 {

	public static void main(String[] args) {
		N n=new N();
		N n2=new N();
		System.out.println(n.hashCode());//Different output
		System.out.println(n2.hashCode());
		N n3=new N();
		  n2=n3;
		System.out.println(n3.hashCode());//Same Output
		System.out.println(n2.hashCode());

	}

}
