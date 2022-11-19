package Two;

public class B {

	public static void main(String[] args) {
		Integer i1=new Integer(10);//Boxing Operation
		int a=i1.intValue();//Un-Boxing Operation
		System.out.println("value of a is "+a);
		
		Double d1=new Double(10.5);//Un-Boxing Operation
		Double d=d1.doubleValue();//Un-Boxing Operation
		System.out.println("Value of d is "+d);
	}

}
