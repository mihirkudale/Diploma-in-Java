package Five;

import java.util.ArrayList;

public class Test5 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Manual");
		list.add("SQL");
		list.add("Java");
		list.add("Selenium");
		list.add("AJava");
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove("SQL"));
		System.out.println(list);
	}

}
