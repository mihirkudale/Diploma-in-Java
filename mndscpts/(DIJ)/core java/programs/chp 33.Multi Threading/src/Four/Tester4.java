package Four;

public class Tester4 {

	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		t1.setName("Initiator");
		for(int i=1;i<4;i++)
		{
			System.out.println(t1.getName()+"::"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
