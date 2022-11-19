//Set
package TwentySeven;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test8 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
		set.add("Abhay");
		set.add("Disha");
		set.add("Nisha");
		set.add("Jisha");
		Iterator itr=set.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s.toUpperCase());
		}

	}

}
