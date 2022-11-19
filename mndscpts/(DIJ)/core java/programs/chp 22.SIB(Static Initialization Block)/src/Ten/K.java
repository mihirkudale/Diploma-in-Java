package Ten;

public class K {
	{
		System.out.println("IIB");
		new K();
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		K k1=new K();
		System.out.println("from main");
	}

}
