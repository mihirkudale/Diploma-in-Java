//List
package One;

import java.util.ArrayList;

class A
{
	
}
public class Test1 {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		list.add(10.5);
		list.add('A');
		list.add("hey");
		list.add(true);
		list.add(10);
		list.add(new A());
		System.out.println("list is "+list);
		System.out.println("size of array list is "+list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
