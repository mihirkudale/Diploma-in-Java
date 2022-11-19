
 class Bulb implements SWITCH
{

	public void on() 
	{
		System.out.println("bulb is turned on");
	}

	public void off() 
	{
		System.out.println("bulb is turned off");	
	}
}
 class Fan implements SWITCH
{
	
	public void on() 
	{
		System.out.println("Fan is turned on");
	}
	
	
	public void off() 
	{
		System.out.println("Fan is turned off");
	}
}
 class MyClass
 {
 	static SWITCH mymethod(char ch)
 	{
 		if(ch=='f')
 		{
 			return new Fan();
 		}
 		else
 		{
 			return new Bulb();
 		}
 			
 	}
 	
 }

public class Tester1
{
	public static void main(String[] args) 
	{
		SWITCH s1=MyClass.mymethod('f');
		s1.on();
		s1.off();
	}
}

