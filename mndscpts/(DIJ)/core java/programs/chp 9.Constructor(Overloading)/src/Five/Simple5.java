package Five;

public class Simple5 {
	int stdid;
	Simple5()
	{
		System.out.println("Running Constructor");
	}
		public static void main(String[] args) {
			System.out.println("Main Starts");
			Simple5 s5=new Simple5();
			System.out.println("Value of stdid is :"+s5.stdid);
			System.out.println("----------");
			Simple5 s55=new Simple5();
			System.out.println("Value of stdid is :"+s55.stdid);
			System.out.println("Main Ends");	
	}

}
