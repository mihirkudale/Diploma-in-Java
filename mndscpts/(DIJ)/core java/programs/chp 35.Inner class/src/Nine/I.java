package Nine;


public class I {
	class J
	{
		int i=20;
	}
	class K extends J
	{
		int j=40;
	}
	public static void main(String[] args) {
		I i1=new I();
		I.K k1=i1.new K();
		System.out.println(k1.i);
		System.out.println(k1.j);			
	}

}
