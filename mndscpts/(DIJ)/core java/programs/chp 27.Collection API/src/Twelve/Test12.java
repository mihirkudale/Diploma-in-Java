//List
package Twelve;

import java.util.ArrayList;

class Z
{
	@Override
	public String toString()
	{
		return "Z class Object";
	}
}
public class Test12 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Z());
		list.add(new String("Hello"));
		list.add("hi");
		list.add(new Integer(10));
		list.add(105);
		list.add(true);
		list.add('A');
		for (Object obj:list) {
			System.out.println(obj);
		}

	}

}
