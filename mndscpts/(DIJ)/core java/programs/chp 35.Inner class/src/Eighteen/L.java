package Eighteen;

public class L {
	static class M
	{
		int i=80;
	}
	static class N extends M
	{
		int j=90;
	}
	public static void main(String[] args) {
		N n1=new N();
		System.out.println(n1.i);
		System.out.println(n1.j);
	}
}
