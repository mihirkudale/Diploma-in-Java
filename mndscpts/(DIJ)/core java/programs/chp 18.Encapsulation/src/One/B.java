package One;
class Z
{
	private double empSal;
	Z(double empSal)
	{
		this.empSal=empSal;
	}
public double getempSal()//Getters
{
	return empSal;
}
	public void setempSal(double empSal)//Setters 
	{
		this.empSal=empSal;
	}
}
class B
{
	public static void main(String[] args) 
	{
     	Z z=new Z(2000.5);
		System.out.println("Emp sal is" +z.getempSal());
		//a.empSal=9000.5;//No direct access
		z.setempSal(9000.5);
		System.out.println("Emp sal is" +z.getempSal());
	}
}
