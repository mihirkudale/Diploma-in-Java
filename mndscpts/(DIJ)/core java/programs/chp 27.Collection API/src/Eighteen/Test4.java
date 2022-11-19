//Queue
package Eighteen;

import java.util.PriorityQueue;

public class Test4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		queue.add("Mango");
		queue.add("Mango");
		queue.add("70");
		queue.add("Mango");
		queue.add("$@");
		System.out.println(queue);
	}

}
