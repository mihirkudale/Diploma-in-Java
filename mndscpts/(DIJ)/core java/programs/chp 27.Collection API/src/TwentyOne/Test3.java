//Set
package TwentyOne;

import java.util.TreeSet;

public class Test3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(40);
		set.add(10);
		set.add(20);
		set.add(60);
		set.add(50);
		System.out.println(set.size());
		System.out.println(set);
	}

}
