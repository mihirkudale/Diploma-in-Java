package Seven;

public class Student {
	String stdName;
	int stdId;
	int age;
	Student(String name,int id)
	{
		stdName=name;
		stdId=id;
	}
	Student(String name,int id,int a)
	{
		this(name, id);
		age=a;
	}
	public static void main(String[] args) {
		Student rv1=new Student("J",10,90);
		System.out.println("1st student id is: "+rv1.stdId);
		System.out.println("1st student Name is: "+rv1.stdName);
		System.out.println("1st student age is: "+rv1.age);
	}

}
