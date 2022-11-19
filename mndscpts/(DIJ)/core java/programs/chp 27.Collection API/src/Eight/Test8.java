//List
package Eight;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();
		list.add("Encapsulation");
		list.add("TypeCasting");
		list.add("Abstraction");
		list.add("WrapperCLass");
		list.add("Collections");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
