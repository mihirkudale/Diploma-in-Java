package Five;

interface TV
{
	void display();
	void sound();
	void remote(int channel);
}
class sony implements TV
{
	@Override
	public void display() {
		System.out.println("sony led display");	
	}
	@Override
	public void remote(int channel) {
		System.out.println("Sony is in channel number"+channel);
	}
	@Override
	public void sound() {
		System.out.println("sony dts sound system");
	}
}
public class Tester2 {

	public static void main(String[] args) {
		sony s1=new sony();
		s1.display();
		s1.remote(10);
		s1.sound();
	}

}
