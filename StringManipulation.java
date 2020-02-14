package Assignment;


import java .util.*;
class UseMainCode
{
	static String concatstring(String s1,String s2)
	{
		String str1,str2,str,s;
		int a,b;
		str1=s1;
		str2=s2;
		a=str1.length();
		b=str2.length();
		if(a<b)
		{
			s=str2.substring((b-a),b);
			str=str1.concat(s);
			return str;
		}
		else
		{
			s=str1.substring((a-b),a);
			str=s.concat(str2);
			return str;
		}
	}
}

public class StringManipulation
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		String str3,str4,st;
		System.out.println("Enter the first string");
		str3=ob.next();
		System.out.println("Enter the second string");
		str4=ob.next();
		if(str3.length()==str4.length())
		{
			st=str3.concat(str4);
			System.out.println(st);
		}
		else
		{
			st=UseMainCode.concatstring(str3,str4);
			System.out.println(st);
		}
	}
}