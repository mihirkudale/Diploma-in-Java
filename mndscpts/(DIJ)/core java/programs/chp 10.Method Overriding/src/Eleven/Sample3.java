package Eleven;

public class Sample3 {
	String name;
	void t(String name)
	{
		System.out.println(name);
		this.name=name;
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Sample3 s3=new Sample3();
		s3.t("ramesh");
	}

}
