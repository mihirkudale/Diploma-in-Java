package Eight;

class M {
	int i;
	int j;
	M(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public int hashcode()
	{
		return i+j;
	}
}	
public class Tester7 
{

	public static void main(String[] args) 
	{
		M m1=new M(70,70);
		System.out.println(m1.hashCode());
		M m2=new M(10,10);
		System.out.println(m2.hashCode());
	}

}
