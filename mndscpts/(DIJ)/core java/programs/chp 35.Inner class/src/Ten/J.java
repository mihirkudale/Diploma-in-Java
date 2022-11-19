package Ten;

public class J {
	class K
	{
		{
			System.out.println("from IIB"); //Called first
		}
		K()
		{
			System.out.println("constructor");
		}
	}
	public static void main(String[] args) {
		J j1=new J();
		j1.new K(); //K k1=j1.new K();
	}

}
