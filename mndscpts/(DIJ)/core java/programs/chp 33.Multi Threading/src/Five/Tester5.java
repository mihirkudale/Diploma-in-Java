package Five;

class A extends Thread
		{
			@Override
			public void run()
			{
				Thread t1=Thread.currentThread();
				for (int i = 1; i <= 5; i++) {
					System.out.println(t1.getName()+"::"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
class B extends Thread
		{
			@Override
			public void run()
			{
				Thread t1=Thread.currentThread();
				for (int i = 1; i <= 5; i++) {
					System.out.println(t1.getName()+"::"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
public class Tester5 {

	public static void main(String[] args) {
		A a1=new A();
		a1.setName("A Thread");
		a1.start();
		B b1=new B();
		b1.setName("B Thread");
		b1.start();
		Thread t1=Thread.currentThread();
		t1.setName("Initiator");
		for (int i = 1; i <= 5; i++) {
			System.out.println(t1.getName()+"::"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
