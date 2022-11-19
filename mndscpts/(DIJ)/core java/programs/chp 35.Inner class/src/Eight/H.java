package Eight;

public class H {
	class I
	{
		int i=10;
	}
	class J
	{
		int j=20;
	}
	public static void main(String[] args) {
		H h1=new H();
		I i1=h1.new I();
		System.out.println(i1.i);
		J j1=h1.new J();
		System.out.println(j1.j);	
	}

}
