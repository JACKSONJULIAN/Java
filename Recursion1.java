
import java.util.Scanner;
public class Recursion1
{

public static void main(String args[])
{
	int n;
	Scanner ob14= new Scanner(System.in);
	System.out.println("enter any natural no");
	n=ob14.nextInt();
	System.out.println("the facorial of "+ n+ " is = " + Factorial(n));
	
}
			static int Factorial(int a)
				{
						if(a>1)
							return a* Factorial(a-1);
						else
							return 1;
				}			
}
