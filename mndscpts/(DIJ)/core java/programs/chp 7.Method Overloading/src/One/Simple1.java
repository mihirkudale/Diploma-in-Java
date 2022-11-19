package One;

public class Simple1 
{
	void greet()
	{
	System.out.println("Welcome to Home");	
	}
	void greeting(String name)
	{
		System.out.println("Welcome to Home:"+name);
	}
	public static void main(String[] args) {
		Simple1 s=new Simple1();
		s.greet();
		s.greeting("JSM");
	}

}
