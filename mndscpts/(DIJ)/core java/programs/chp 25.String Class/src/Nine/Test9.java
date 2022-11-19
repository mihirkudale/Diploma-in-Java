package Nine;

public class Test9 
{

	public static void main(String[] args) 
	{
		String rv1="DAD";
		String rv2="";
		for (int i=rv1.length()-1;i>=0;i--) 
		{
			rv2=rv2+rv1.charAt(i);
		}
			System.out.println("The original string :: " + rv1);
			System.out.println("The reverse string :: " + rv2);
			if (rv1.equalsIgnoreCase(rv2)) 
			{
				System.out.println("Its a Palindrome");
			}
			else
			{
				System.out.println("its not a palindrome");
			}	
		}
	}

