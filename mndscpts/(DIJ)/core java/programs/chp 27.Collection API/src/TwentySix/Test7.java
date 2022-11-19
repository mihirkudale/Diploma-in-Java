package TwentySix;

import java.util.LinkedHashSet;

public class Test7 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		String rv="aaabbbccc";
		LinkedHashSet set=new LinkedHashSet();
		for (int i = 0; i < rv.length(); i++) {
			set.add(rv.charAt(i));
		}
		System.out.println(set);
	}

}
