//List
package Ten;

import java.util.ArrayList;
import java.util.Collections;

public class Test10 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add('E');
		list.add('D');
		list.add('C');
		list.add('B');
		list.add('A');
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 'A'));
		System.out.println(Collections.binarySearch(list, 'E'));
	}

}
