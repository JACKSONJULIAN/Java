package Assignment;
import java.util.*;
class UserMainCodeq2
{
	static int validateNumber(String str)
	{
		if(str.matches("\\d{3}-\\d{3}-\\d{4}"))
				return 1;
		else
				return -1;
	}
}
public class mainq2
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		int a;
		String s;
		System.out.println("Enter a phone no in the formet(xxx-xxx-xxxx)");
		s=ob.next();
		if(s.length()==12)
		{
			a=UserMainCodeq2.validateNumber(s);
				if(a==1)
					System.out.println("format is valid");
				else if(a==-1)
					System.out.println("format invalid");
		}
		else
			System.out.println("you have missed some digits");
	}
}
