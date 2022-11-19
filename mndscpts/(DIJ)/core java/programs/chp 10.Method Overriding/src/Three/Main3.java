package Three;
class Person
{
	String name;
	int age;
	Person (String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("The name is:"+name);
		System.out.println("The age is:"+age);
	}
}
class Trainer extends Person
{
	String subject;
	double salary;
	Trainer(String name,int age,String subject,double salary)
	{
		super(name, age);
		this.subject=subject;
		this.salary=salary;
	}
	void display()
	{
	super.display();
	System.out.println("The subject is:"+subject);
	System.out.println("The salary is:"+salary);
	}
}
public class Main3 {

	public static void main(String[] args) {
		Trainer tr1=new Trainer("Jo",90,"Java",500000);
		tr1.display();
		Trainer tr2=new Trainer("J",90,"SQL",500000);
		tr2.display();
	}

}
