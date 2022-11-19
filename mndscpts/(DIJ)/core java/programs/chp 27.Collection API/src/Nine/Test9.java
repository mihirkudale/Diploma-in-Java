//List
package Nine;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Encapsulation");
		list.add("TypeCasting");
		list.add("Abstraction");
		list.add("WrapperCLass");
		list.add("Collections");
		System.out.println("Before:"+list);
		Collections.sort(list);
		System.out.println("After:"+list);
		Collections.reverse(list);
		System.out.println("reverse of sort:"+list);
	}

}
