package Assignment;
import java.util.Scanner;
class UseMainCode1
{
	static String concatstring(String s1,String s2)
	{
		String str1,str2,s;
		String str="";
		char ch;
		int a,b;
		str1=s1;
		str2=s2;
		a=str1.length();
		b=str2.length();
		if(a<b)
		{
			for(int i=(b-a);i<b;i++)
			{
				ch=str2.charAt(i);
				str+=ch;
			}
			s=str1.concat(str);
			return s;
		}
		else
		{
			for(int i=(a-b);i<a;i++)
			{
				ch=str1.charAt(i);
				str+=ch;
			}
			s=str.concat(str2);
			return s;
		}
	}
}

public class StringManipulation2
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
			UseMainCode1 ob1=new UseMainCode1();
			st=ob1.concatstring(str3,str4);
			System.out.println(st);
		}
	}
}