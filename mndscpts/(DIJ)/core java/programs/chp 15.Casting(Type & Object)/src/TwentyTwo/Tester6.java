//object casting
package TwentyTwo;
class Pendrive implements USBPORT
{
	public void read() 
	{
		System.out.println("Reading from Pendrive");
	}
	public void write() 
	{
		System.out.println("Writing to Pendrive");
	}
}
class Mobiledevice implements USBPORT
{
	public void read() 
	{
		System.out.println("Reading from Mobile-device");
	}
	public void write() 
	{
		System.out.println("Writing to Mobile-device");
	}
}
class Myclass
{
	public static void demo(USBPORT driver)
	{
		driver.read();
	    driver.write();
	}
}
public class Tester6 
{

	public static void main(String[] args) 
	{
		Myclass.demo(new Pendrive());
		Myclass.demo(new Mobiledevice());
	}

}
