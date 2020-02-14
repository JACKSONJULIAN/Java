	package Assignment;
	import java.util.*;
	
	class UserMainCode
	{
		static int checksum(int a)
		{
			int r,sum=0;
			int x=a;
			while(x>0)
			{
				r=x%10;
				x=x/10;
				if((r%2)!=0)
				sum+=r;
			}
			if(sum%2==0)
				return -1;
			else
				return 1;
		}
	}
	public class main1
	{
	public static void main()
	{
		Scanner ob=new Scanner(System.in);
		int n,y;
		System.out.println("Enter any positive number");
		n=ob.nextInt();
		//UserMainCode ob1=new UserMainCode();
		
		 y=UserMainCode.checksum(n);
		if(y==1)
			System.out.println("sum of odd digits of your no is odd");
		else if(y==-1)
		    System.out.println("sum of odd digits of your no is odd");
			
	}
	}
