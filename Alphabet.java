import java.util.Scanner;
   class Alphabet
{
            public static void main(String[] args)
               {
	Scanner ob7= new Scanner(System.in);
		char a;
	System.out.println(" enter any alphabet ");
		a=ob7.next().charAt(0);
	  		if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U')
				System.out.println(" The alphabet you entered is a vowel");
			else
				System.out.println(" The alphabet you entered is a consonant");

		}
}