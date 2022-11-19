package Five;

public class Demo {
	Demo()
	{
		System.out.println("From demo()");
	}
	Demo(int a)
	{
		this();
		System.out.println("From demo(int a)");
	}
	Demo(int a,double d)
	{
		this(90); //when no parameter given,above Demo(int a) constructor will not be called.
		/*But other two constructor will be called,when this(90) constructor is not mentioned
		 * here,then current constructor will be executed not the above 2
		 */
		System.out.println("From demo(int a,double d)");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Demo rv=new Demo(20, 20.5);
	}

}
