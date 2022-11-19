//List
package Thirteen;

import java.util.ArrayList;

public class Test13 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Bendakaluru");
		list.add("BBSR");
		list.add("Magaluru");
		list.add("Hyderabad");
		String s1=(String) list.get(0);
		System.out.println(s1.toUpperCase());
		
		String s2=(String) list.get(1);
		System.out.println(s1.length());
		
		String s3=(String) list.get(2);
		System.out.println(s1.charAt(3));
		
		String s4=(String) list.get(3);
		System.out.println(s4.indexOf('y'));
	}

}
