package Five;

public class U {
	static int i;
	{
		i=40;
		System.out.println(i);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		U u1=new U();
	}

}
