package Six;

public class F {
	class G
	{
		G()
		{
			System.out.println("from G");
		}
	}
	public static void main(String[] args) {
		F f1=new F();
		f1.new G();//or G g1=f1.new G();
	}

}
