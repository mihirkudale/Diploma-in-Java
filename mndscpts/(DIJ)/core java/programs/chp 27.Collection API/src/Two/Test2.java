//List
package Two;

import java.util.ArrayList;

public class Test2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(10.5);
		System.out.println(list);
		list.add("Hi");//Appends the given element to the end
		System.out.println(list);
		list.add(1,90);//Inserts the given element into the given index
		System.out.println(list);
		list.add(0,true);//modifies the given indexed element with new Element
		System.out.println(list);
		}

	}



