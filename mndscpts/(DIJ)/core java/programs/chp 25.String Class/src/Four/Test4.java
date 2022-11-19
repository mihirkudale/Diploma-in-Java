package Four;

public class Test4 {

	public static void main(String[] args) {
		String rv1=new String("WaterMelon");
		String rv2="WaterMelon";
		String rv3="Water";
		//String rv4="Melon";
		//String rv5="Water"+"Melon";
		String rv6=rv3+"Melon";
		System.out.println(rv1.equals(rv2));
		System.out.println(rv2.equals(rv3));
		System.out.println(rv1.equals(rv6));

	}

}
