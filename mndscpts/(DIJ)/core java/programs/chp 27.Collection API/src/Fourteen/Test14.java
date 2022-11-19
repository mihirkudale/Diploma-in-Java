//List
package Fourteen;

import java.util.ArrayList;

class Mobile
{
	void Message()
	{
		System.out.println("Message method");
	}
}
public class Test14 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Mobile());
		list.add(new Mobile());
		list.add(new Mobile());
		Mobile m1=(Mobile)list.get(0);
		m1.Message();
		Mobile m2=(Mobile)list.get(1);
		m2.Message();
		Mobile m3=(Mobile)list.get(2);
		m3.Message();

	}

}
