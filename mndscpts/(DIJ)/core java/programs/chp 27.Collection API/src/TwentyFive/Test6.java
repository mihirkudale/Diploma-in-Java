//Set
package TwentyFive;

import java.util.HashSet;
import java.util.Iterator;

public class Test6 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(10.5);
		set.add(true);
		set.add(null);
		set.add('A');
		set.add("hi");
		System.out.println(set);
		Iterator itr=set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set);
		Iterator itr2=set.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println(set);
	}
}
