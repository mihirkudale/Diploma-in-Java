//Set
package Nineteen;

import java.util.HashSet;

public class Test1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(10);
		set.add(20.5);
		set.add(30);
		set.add('A');
		set.add(10);
		set.add(true);
		set.add(null);
		System.out.println(set.size());
		System.out.println(set);
	}

}
