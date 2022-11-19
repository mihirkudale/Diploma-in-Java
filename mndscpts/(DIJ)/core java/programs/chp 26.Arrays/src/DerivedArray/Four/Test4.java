package DerivedArray.Four;


public class Test4
{
	public static void main(String[] args) 
	{
		String[] ref=new String[5];
		ref[0]=new String("Namaste");
		ref[1]=new String("Subhodayam");
		ref[2]=new String("Swagatam");
		ref[3]=new String("Syankalam");
		ref[4]=new String("Ratriam");
		for (int i = 0; i < ref.length; i++) 
		{
			System.out.println(ref[i].toUpperCase());
		}
	}
}