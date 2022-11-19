package Ten;
//count of total number of Occurrence of 'A'
public class Test10 {

	public static void main(String[] args) {
		String rv="MALAYALAM";
		int count=0;
		for (int i = 0; i < rv.length(); i++) {
			if(rv.charAt(i)=='A')
			{
				count++;
			}
		}
		System.out.println("the count is   "+count);
	

	}

}
