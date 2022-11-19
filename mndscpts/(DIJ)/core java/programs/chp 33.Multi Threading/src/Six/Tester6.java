package Six;

public class Tester6 {

	public static void main(String[] args) {
		EvenNumber a1=new EvenNumber();
		a1.setName("even no");
		a1.start();
		OddNumber b1=new OddNumber();
		b1.setName("Odd number");
		b1.start();
	}

}
class EvenNumber extends Thread
{
	@Override
	public void run()
	{
		Thread t1=Thread.currentThread();
		for (int i = 1; i <= 20; i++) {
			System.out.println(t1.getName()+"::"+i);
		}
	}
}
class OddNumber extends Thread
{
	@Override
	public void run()
	{
		Thread t1=Thread.currentThread();
		for (int i = 1; i <= 30; i++) {
			System.out.println(t1.getName()+"::"+i);
		}
	}
}
	