package DerivedArray.Seven;


public class Test7 
{
	public static void main(String[] args) 
	{
		String rv="We live in Earth";
		String[] ref=rv.split(" ");
		for(String s:ref)
		{
			System.out.println(s);
		}
		System.out.println("length of the String is "+ref.length);

	}

}
