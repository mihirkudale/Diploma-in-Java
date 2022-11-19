//Set
package Twenty;

import java.util.LinkedHashSet;

public class Test2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
		set.add(10);
		set.add(10);
		set.add(20.5);
		set.add('A');
		set.add(10);
		set.add(true);
		set.add(null);
		System.out.println(set.size());
		System.out.println(set);
	}

}
