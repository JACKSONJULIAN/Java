import java.util.Scanner;
 public class Prime1 
 {
	 	public static void main(String args[]) 
{
	 			Scanner ob= new Scanner(System.in);
	 				int i,j,m,n,p,sum=0;
	 				
	System.out.println("Enter the range [n,m]between which prime numbers are to be found");
				n=ob.nextInt();
				m=ob.nextInt();
			for(i=n;i<=m;i++)
			{	p=1;
				if(i==1)
					continue;
				for(j=2;j<=(i/2);j++)
				{
					if((i%j)==0)
					{
						p=0;
						break;
						
					}
				}
					if(p==1)
						{
						System.out.print(i+ ", ");
						sum+=i;
						}
			}
			System.out.println("The sum of prime numbers is=" + sum);	
}
}