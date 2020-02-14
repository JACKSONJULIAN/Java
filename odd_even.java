import java.util.Scanner;
class odd_even{
public static void main(String[] args)
{
float a;
Scanner ob3= new Scanner(System.in);
System.out.println(" Enter the nomber to be checked as odd or even");
a=ob3.nextFloat();
System.out.println("your no "+ a + " " + "is "+ ((a%2==0)? "even":"odd"));
}}