//Set
package TwentyTwo;

import java.util.HashSet;

public abstract class Test4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set=new HashSet();
		System.out.println(set.add(10));
		System.out.println(set.add(10));
		System.out.println(set.add(20.5));
		System.out.println(set.add('A'));
		System.out.println(set.add(20.5));
		System.out.println(set.add("hi"));
		System.out.println(set.add(null));
		System.out.println(set.add(20.5));
	}

}
