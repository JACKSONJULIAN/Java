import java.util.Scanner;
import java.lang.Math;
class Series
{
	public static void main(String args[])
	{
	Scanner ob11= new Scanner(System.in);
		int a=-1,i,n,x;
		
	System.out.println(" Enter a value N upto which series of type 1,-2,3..N is to be printed"); 
		n=ob11.nextInt();
		for(i=1;i<=n;i++)
			{
			x= (int) Math.pow(a,(i-1))*i;	
	                System.out.print(x+ ", " );	
			}
	}
}