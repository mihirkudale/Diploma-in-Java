//Set
package TwentyEight;

import java.util.Iterator;
import java.util.TreeSet;

public class Test9 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add("einsein");
		set.add("Dravid");
		set.add("Chetak");
		set.add("Tata");
		System.out.println(set);
		Iterator itr=set.iterator();
		String s1=(String)itr.next();
		System.out.println(s1.toUpperCase());
		
		String s2=(String)itr.next();
		System.out.println(s1.length());
		
		String s3=(String)itr.next();
		System.out.println(s1.charAt(3));
		
		String s4=(String)itr.next();
		System.out.println(s4.indexOf(1));
	}

}
