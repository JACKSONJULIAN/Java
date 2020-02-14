import java.util.Scanner;
   class Nnumber
{
            public static void main(String[] args)
               {
	Scanner ob8= new Scanner(System.in);
		int n,sum=0;
               System.out.println( "enter a natural number N");
		n=ob8.nextInt();
			sum=((n+1)*(n+1)/4);
		System.out.print( "The sum of all odd numbers upto " +n+ " is =" + sum);
		}
}