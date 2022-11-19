//Queue
package Seventeen;

import java.util.PriorityQueue;

public class Test3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		queue.add('E');
		queue.add('D');
		queue.add('C');
		queue.add('B');
		queue.add('A');
		int size=queue.size();
		for (int i = 1; i <= size; i++) {
			System.out.println(queue.poll());
		}
		
	}

}
