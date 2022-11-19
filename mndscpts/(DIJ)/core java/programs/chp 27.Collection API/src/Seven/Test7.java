//List
package Seven;

import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "serial" })
public class Test7 extends ArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Test7 list=new Test7();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		System.out.println(list);
		list.removeRange(2, 7);
		System.out.println(list);
	}

}
