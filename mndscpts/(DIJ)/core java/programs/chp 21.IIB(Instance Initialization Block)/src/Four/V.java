package Four;

public class V {
	int i;
	{
		i=20;
		System.out.println(i);//instance variable can be directly accessed by IIB
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		V v1=new V();
	}

}
