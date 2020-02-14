import java.util.Scanner;
class student
{
	public static void main(String[] args)
	{
		Scanner ob5 = new Scanner(System.in);
		int mark[]= new int[3];
		int sum=0,avg,i;
		String name;
		String class1;

		System.out.println(" Enter name of the student");
		name=ob5.next();
		System.out.println( "Enter  marks in 3 subjects out of 100");
		for(i=0;i<3;i++)
			{
				mark[i]=ob5.nextInt();
			}
		for(i=0;i<3;i++)
			{
				sum=sum+mark[i];
			}
		avg=(sum/3);
		if(avg>80)
				class1="First class";
		else if(avg>70 && avg<=80)
				class1=" Second class";
		else if(avg>40 && avg<=70)
				class1="Passed";
		else 
			class1="Failed";
		System.out.println(" Your name is:\t" +name);
		System.out.println(" Your class is:\t" +class1);
		System.out.print("\n\n\n class details: First class above 80%, Second class above 70%, Passed above 40%, Failed below 40% ");
	}

}