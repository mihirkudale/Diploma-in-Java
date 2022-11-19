package Two;

abstract class Animal
{
	abstract void move();
	abstract void sound();
}
class dog extends Animal
{
	@Override
	void move()
	{
		System.out.println("dog moves");
	}
	@Override
	void sound()
	{
		System.out.println("bow bow");
	}
}
class cat extends Animal
{
	@Override
	void move()
	{
		System.out.println("cat moves");
	}
	@Override
	void sound()
	{
		System.out.println("meow meow");
	}
}
public class Tester2 {

	public static void main(String[] args) {
		//Animal a=new Animal();//Animal class is abstract and cannot be instantiated 
		dog d1=new dog();
		d1.move();
		d1.sound();
		cat c1=new cat();
		c1.move();
		c1.sound();
	}

}
