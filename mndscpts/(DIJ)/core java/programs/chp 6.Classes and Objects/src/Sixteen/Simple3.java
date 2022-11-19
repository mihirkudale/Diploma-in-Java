//If local & Global variables have same name,then we should use class-name to access global variable
package Sixteen;

public class Simple3 {
	static int a=10;//Global variable
	public static void main(String[] args) {
		int a=20;//Local Variable
		System.out.println("local a="+a);
		System.out.println("Global a=" +Simple3.a);
	}

}
