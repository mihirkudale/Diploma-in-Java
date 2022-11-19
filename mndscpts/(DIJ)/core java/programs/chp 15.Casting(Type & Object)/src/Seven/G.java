//primitive casting
package Seven;

public class G {
	static void percentage(int m1,int m2,int m3)
	{
		int total=m1+m2+m3;
		double per=((double)total*100)/300;
		System.out.println("percentage="+per);
	}
	public static void main(String[] args) {
		percentage(99, 97, 96);

	}

}
