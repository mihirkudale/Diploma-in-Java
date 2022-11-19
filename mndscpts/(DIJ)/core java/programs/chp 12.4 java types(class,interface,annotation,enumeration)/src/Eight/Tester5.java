package Eight;

interface exam
{
	void percentage();
}
class student
{
	String name;
	int m1,m2,m3;
	 student(String name,int m1,int m2,int m3) 
	 {
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	 }
	 void display()
	 {
		 System.out.println("the name is "+name);
		 System.out.println("the marks1 is: "+m1);
		 System.out.println("the marks2 is: "+m2);
		 System.out.println("the marks2 is: "+m3);
	 }
}
class Result extends student implements exam
{
	public Result(String name,int m1,int m2,int m3) 
	{
		super(name, m1, m2, m3);//call to student constructor of student class
	}
	public void percentage()//interface 
	{
		int total=m1+m2+m3;
		int percent=(total*100)/300;
		System.out.println("percentage of " +name + " is: "+percent);
	}
}
public class Tester5 {

	public static void main(String[] args) {
		Result r1=new Result("JSM", 99, 99, 99);
		r1.display();//from class
		r1.percentage();//from interface
	}
 
}
