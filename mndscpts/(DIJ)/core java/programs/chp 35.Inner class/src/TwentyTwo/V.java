package TwentyTwo;

public class V {
	static class W
	{
		static int j=60;
		int i=70;
	}
	class X extends W
	{
		
	}
	public static void main(String[] args) {
		V v1=new V();
		X x1=v1.new X();
		System.out.println(x1.i);
		System.out.println(X.j);//X will be converted to W,because conversion takes place
	}

}
