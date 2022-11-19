//Set
package TwentyThree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test5 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set=new LinkedHashSet();
		set.add(10);
		set.add(20.5);
		set.add('A');
		set.add("Hi");
		set.add(90);
		System.out.println(set);
		Iterator itr=set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(set);
	}

}
