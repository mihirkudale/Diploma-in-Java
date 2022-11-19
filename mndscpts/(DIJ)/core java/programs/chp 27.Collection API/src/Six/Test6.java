//List
package Six;

import java.util.ArrayList;

public class Test6 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		ArrayList list3=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		list3.add(60);
		list3.add(70);
		list3.add(80);
		list3.add(90);
		list3.add(100);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		list1.removeAll(list2);
		System.out.println(list1);
		list2.retainAll(list3);
		System.out.println(list2);
	}

}
