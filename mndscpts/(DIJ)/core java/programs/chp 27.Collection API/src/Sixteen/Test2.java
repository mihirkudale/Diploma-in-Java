//Queue
package Sixteen;

import java.util.PriorityQueue;

public class Test2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		queue.add(10.5);
		queue.add(10.4);
		queue.add(10.3);
		queue.add(10.2);
		queue.add(10.1);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}
