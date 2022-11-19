package Six;

public class W {
	W()
	{
		System.out.println("From constructor");
	}
	{
		System.out.println("from IIB-2");
	}
	{
		System.out.println("from iib-1");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		W w1=new W();
	}

}
