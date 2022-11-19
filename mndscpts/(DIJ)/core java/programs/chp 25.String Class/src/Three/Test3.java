package Three;

public class Test3 {

	public static void main(String[] args) {
		String rv1=new String("WateMelon");
		String rv2="WaterMelon";
		String rv3="Water";
		//String rv4="Melon";
		String rv5="Water"+"Melon";
		String rv6=rv3+"Melon";//new Operator will be used.
		System.out.println(rv1==rv2);
		System.out.println(rv2==rv5);
		System.out.println(rv1==rv6);
	

	}

}
