//Set
package TwentyFour;

import java.util.HashSet;

public class Test6 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set=new HashSet();
		System.out.println(set.add(10));
		System.out.println(set.add(10));
		System.out.println(set.add(20.5));
		System.out.println(set.add('A'));
		System.out.println(set.add(20.5));
		System.out.println(set.add("Hi"));
		System.out.println(set.add(null));
		System.out.println(set.add(20.3));
		System.out.println(set.size());
		System.out.println(set);
	}

}
