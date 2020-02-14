package Assignment;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class UserMainCode9
{
	static int validateDate(String str)
	{
		String str1=str;
		SimpleDateFormat sdfrmt =new SimpleDateFormat("dd/mm/yyyy");
		try
		{
			sdfrmt.parse(str1);
			return 1;
		}
		catch(Exception ex)
		{
			return -1;
		}
		
	}
}
public class Main9 
{
public static void main(String[] args)
{
	Scanner ob=new Scanner(System.in);
	int a;
	String st;
	System.out.println("Enter date in the format dd/mm/yyyy");	
	st=ob.next();
	a=UserMainCode9.validateDate(st);
	if(a==1)
	System.out.println("String is of valid format");
	else if(a==-1)
		System.out.println("String is of invalid format");
}
}
