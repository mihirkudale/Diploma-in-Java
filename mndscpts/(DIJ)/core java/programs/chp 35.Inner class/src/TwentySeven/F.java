package TwentySeven;

public class F {
	class G
	{
		int i=10;
	}
	public static void main(String[] args) {
		F  f1=new F();//creating object of F class
		G g1=f1.new G() {
			
		};
		System.out.println(g1.i);
	}

}
