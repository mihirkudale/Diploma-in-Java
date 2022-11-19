package Ten;

public class Sample2 {
	int stdId;//Variable
	void test(int stdId)//Method
	{
		System.out.println(stdId);
		System.out.println(this.stdId);//Tcs,inside SOP
	}
	public static void main(String[] args) {
		Sample2 s=new Sample2();
		s.test(10);
	}

}
