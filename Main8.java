package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class UserMainCode8
{
	
	static List<Integer> SortMergedArrayList(List<Integer> a1,List<Integer> b1)
	{
		List<Integer> a2 =new ArrayList();
		List<Integer> b2 =new ArrayList();
		List<Integer> merge =new ArrayList();
		a2=a1;
		b2=b1;
		a2.addAll(b2);
		Collections.sort(a2);
		
		merge.add(a2.get(2));
		merge.add(a2.get(6));
		merge.add(a2.get(8));
		return merge;
	}
}
public class Main8 
{
public static void main(String[] args) 
{
	Scanner ob=new Scanner(System.in);
	List<Integer> a =new ArrayList();
	List<Integer> b =new ArrayList();
	List<Integer> merge1=new ArrayList();
	System.out.println("Enter 5 integers for the first list");
	for(int i=0;i<5;i++)
		a.add(ob.nextInt());
	System.out.println("Enter 5 integers for the second list");
	for(int i=0;i<5;i++)
		b.add(ob.nextInt());
	
	merge1= UserMainCode8.SortMergedArrayList(a,b);
	for(int i=0;i<3;i++)
		System.out.println(merge1.get(i));
	
}
}
