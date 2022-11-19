package Nine;

public class Simple8 {
	int stdId;
	Simple8(int id)
	{
		stdId=id;
	}
	public static void main(String[] args) {
		Simple8 s8=new Simple8(10);
		//if no arguments specified,actual and formal arguments will differ
		System.out.println("Value  of stdId is: " +s8.stdId);

	}

}
