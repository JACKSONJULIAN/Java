import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
	Scanner ob10= new Scanner(System.in);
		int i,n, fact=1;
	System.out.println(" Enter a non negative number whos factorial is to be found");
		n=ob10.nextInt();
			for(i=1;i<=n;i++)
				fact=fact*i;
	
	System.out.println(" factorial of " + n + " is = " + fact);	
	}
}