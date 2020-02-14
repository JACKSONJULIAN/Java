import java.util.Scanner;
   class number
{
            public static void main(String[] args)
               {
	Scanner ob6= new Scanner(System.in);
		int n,x;
	System.out.println(" enter any integer no ");
		n=ob6.nextInt();
	  	x=n%10;
	System.out.println(" The last digit of your no is: ");
	switch(x)
		{
			case 0:
  			System.out.print(" Zero ");
			break;
			case 1:
  			System.out.print(" one ");
			break;
			case 2:
  			System.out.print(" two ");
			break;
			case 3:
  			System.out.print(" three ");
			break;
			case 4:
  			System.out.print(" four ");
			break;
			case 5:
  			System.out.print(" five ");
			break;
			case 6:
  			System.out.print(" six ");
			break;
			case 7:
  			System.out.print(" seven ");
			break;
			case 8:
  			System.out.print(" eight ");
			break;
			case 9:
  			System.out.print(" nine ");
			break;
		}
		}
}