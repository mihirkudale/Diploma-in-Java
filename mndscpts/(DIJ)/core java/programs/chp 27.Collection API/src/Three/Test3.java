//List
package Three;

import java.util.ArrayList;

public class Test3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		ArrayList list3=new ArrayList();
		list1.add(10);
		list1.add(20.5);
		list1.add('A');
		list2.add(30.3);
		list2.add("hi");
		list2.add(90);
		list3.add('C');
		list3.add(true);
		list3.add(50);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		list1.addAll(list2);
		System.out.println(list1);
		list2.addAll(list3);
		System.out.println(list2);
	}

}
