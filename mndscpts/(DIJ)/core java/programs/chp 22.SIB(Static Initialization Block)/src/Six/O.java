package Six;

public class O {
	{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	static
	{
		System.out.println("3");
	}
	O()
	{
		System.out.println("4");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		O o1=new O();
		System.out.println("main");
	}

}
