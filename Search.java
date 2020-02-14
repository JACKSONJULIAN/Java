package com.studyJava;
import java.util.Scanner;
public class Search 
{
public static void main(String args[])
{
		Scanner ob13 =new Scanner(System.in);
		int n,i,a,y;
			System.out.println("enter the number of elements");
			n=ob13.nextInt();
			int x[]=new int[n];
			System.out.println("enter the elements");
			for(i=0;i<x.length;i++)
			{
				x[i]=ob13.nextInt();
			}
			System.out.println("press 1 to display elements or 2 to search");
			a=ob13.nextInt();
				if(a==1)
				{
					for(i=0;i<n;i++)
						System.out.println(x[i]);
				}
				else if(a==2)
				{
					System.out.println("enter the element to be searched");
					y=ob13.nextInt();
					for(i=0;i<n;i++)
					{
						if(x[i]==y)
							System.out.println("element "+y + " found at "+ (i+1));
						else
							System.out.println("element not found");
					}
				}
}
}
