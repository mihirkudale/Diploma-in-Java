package DerivedArray.Two;



	class B 
	{
		public String toString()
		{
			return "B class object";
		}
	}
	public class Test2
	{
		public static void main(String[] args) 
		{
			B[] ref=new B[5];
			for (int i = 0; i < ref.length; i++)
			{
				ref[i]=new B();
			}
			for (int i = 0; i < ref.length; i++) 
			{
				System.out.println(ref[i]);
			}
		}
	}
