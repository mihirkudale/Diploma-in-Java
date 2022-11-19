package Eight;

public class Box {
	int length;
	int breadth;
	int height;
	Box(int l,int b,int h)//parameterized Constructor
	{
		height=h;
		length=l;
		breadth=b;
	}
	Box(int side)//parameterized & Constructor Overloading
	{
		this(side,side,side);/*this is calling above constructor of the same class due to 
		Constructor Overloading*/
	}
	void volume()//Method
	{
		int v=length*breadth*height;
		System.out.println("Volume is " +v);
	}
	public static void main(String[] args) {
		Box b1=new Box(2,3,4);
		b1.volume();
		Box b2=new Box(2);
//Volume is 8,bcz this() int Box(int side) is calling the 1st Box and executing the Volume();
		b2.volume();
	}

}
