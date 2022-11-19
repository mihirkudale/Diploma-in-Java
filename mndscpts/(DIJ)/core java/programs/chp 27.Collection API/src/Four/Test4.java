//List
package Four;

import java.util.ArrayList;

public class Test4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Bendakaluru");
		list.add("Guwahati");
		list.add("Bhubaneswar");
		list.add("Pune");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove("Pune");
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
