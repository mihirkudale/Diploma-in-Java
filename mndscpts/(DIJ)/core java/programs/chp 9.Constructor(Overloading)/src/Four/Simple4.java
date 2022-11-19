package Four;

public class Simple4 {

	Simple4()
	{
		System.out.println("Constructor ?");//method with class name.
	}
		public static void main(String[] args) {
			System.out.println("Main Starts");
			@SuppressWarnings("unused")
			Simple4 s4=new Simple4();
			System.out.println("Main Ends");
			System.out.println("-------");	
	}

}


