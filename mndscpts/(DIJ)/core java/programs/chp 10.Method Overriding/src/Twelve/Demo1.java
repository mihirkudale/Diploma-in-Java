package Twelve;

public class Demo1 {
	int c; int j;
	Demo1(int c,int j)//Constructor
	{
		this.c=c;     this.j=j;
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1(10,20);
		System.out.println("d.c=" +d.c);
		System.out.println("d.j=" +d.j);
		
		Demo1 d2=new Demo1(50,60);
		System.out.println("d.c=" +d2.c);
		System.out.println("d.j=" +d2.j);
	}

}
