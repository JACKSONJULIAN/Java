import java.util.Scanner;
class fraction{
public static void main(String[] args)
{
Scanner ob1= new Scanner(System.in); // creation of object
double num=0, intpart,fractpart;
System.out.println(" enter the number which is to be separated into decimal and fraction");
num=ob1.nextDouble();
fractpart=num%1;
intpart=num-fractpart;
System.out.println("The entered no is="+ num);
System.out.println(" the integer part is =" +intpart);
System.out.println(" the fractional part is="+ fractpart);
}}
