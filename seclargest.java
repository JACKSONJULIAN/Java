import java.util.Scanner;
class seclargest{
public static void main(String[] args)
{
int a,b,c,large=0,seclarge=0;
Scanner ob4 = new Scanner(System.in);
System.out.println(" Enter 3 no who's largest and second largest no are to be found\n");
a=ob4.nextInt();
b=ob4.nextInt();
c=ob4.nextInt();
if(a>b)
{
if(a>c)
{
large=a;
if(b>c)
seclarge=b;
else
seclarge=c;
}
else
{
large=c;
seclarge=a;
}}
else
{
if(b>c)
{
large=b;
if(c>a)
seclarge=c;
else
seclarge=a;
}
else
{
large=c;
seclarge=b;
}}
System.out.print(" the largest and second largest among "+ a + " " +b + " " + c+ " are  " + large + " and "+ seclarge);
}}

