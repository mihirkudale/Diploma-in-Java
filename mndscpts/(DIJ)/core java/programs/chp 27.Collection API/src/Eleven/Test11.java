//List
package Eleven;

import java.util.ArrayList;
import java.util.Collections;

public class Test11 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add("Apple");
		list.add("Gauva");
		list.add(90);
		list.add("Orange");
		list.add("Papaya");
		Collections.sort(list);
		System.out.println(list);
	}

}
