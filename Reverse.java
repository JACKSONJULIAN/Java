import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
	Scanner ob9= new Scanner(System.in);
		int rev=0,r,n;
		System.out.println(" enter a number that is to be reversed");
		n=ob9.nextInt();
			while(n>0)
				{
					r=n%10;
					rev=rev*10+r;
					n=n/10;
				}
		System.out.println(" The reversed number is =" + rev );
	}
}